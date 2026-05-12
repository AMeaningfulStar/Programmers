/*
• 알고리즘 유형: DFS / 순열 / 완전탐색
• 핵심 개념: 8명 전체 순열 생성 후 조건 검사
• 시간 복잡도: O(8! × 조건 수)
• 공간 복잡도: O(8)
*/

class Solution {
    int answer = 0;
    char[] friends = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    boolean[] visited = new boolean[8];

    public int solution(int n, String[] data) {
        answer = 0;
        dfs("", data);
        return answer;
    }

    private void dfs(String line, String[] data) {
        if (line.length() == 8) {
            if (isValid(line, data)) {
                answer++;
            }
            return;
        }

        for (int i = 0; i < 8; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(line + friends[i], data);
                visited[i] = false;
            }
        }
    }

    private boolean isValid(String line, String[] data) {
        for (String condition : data) {
            char a = condition.charAt(0);
            char b = condition.charAt(2);
            char op = condition.charAt(3);
            int targetDistance = condition.charAt(4) - '0';

            int posA = line.indexOf(a);
            int posB = line.indexOf(b);
            int distance = Math.abs(posA - posB) - 1;

            if (op == '=' && distance != targetDistance) return false;
            if (op == '<' && distance >= targetDistance) return false;
            if (op == '>' && distance <= targetDistance) return false;
        }

        return true;
    }
}
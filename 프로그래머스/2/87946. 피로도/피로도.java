/*
• 알고리즘 유형: 완전탐색 / 백트래킹 / DFS
• 핵심 개념 목록
 • 던전 방문 순서가 결과에 영향을 줌
 • 가능한 모든 순서를 시도
 • 방문 여부 배열 사용
 • 재귀 호출 후 원상복구(백트래킹)
• 시간 복잡도: O(N!)
• 공간 복잡도: O(N)
*/

class Solution {
    private int answer = 0;
    private boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    private void dfs(int fatigue, int[][] dungeons, int count) {
        // 지금까지 방문한 던전 수로 최대값 갱신
        answer = Math.max(answer, count);

        for (int i = 0; i < dungeons.length; i++) {
            // 아직 방문하지 않았고, 최소 필요 피로도를 만족하면 방문 가능
            if (!visited[i] && fatigue >= dungeons[i][0]) {
                visited[i] = true;

                // 현재 던전 방문 후 다음 탐색
                dfs(fatigue - dungeons[i][1], dungeons, count + 1);

                // 백트래킹: 원상복구
                visited[i] = false;
            }
        }
    }
}
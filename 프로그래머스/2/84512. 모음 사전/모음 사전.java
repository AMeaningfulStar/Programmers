/*
• 알고리즘 유형: DFS / 완전탐색
• 핵심 개념
 • 길이 1~5 문자열 생성
 • 사전순 생성
 • 현재 문자열 방문 후 하위 문자열 탐색
• 시간 복잡도: O(5⁵)
• 공간 복잡도: O(5)
*/

class Solution {
    String[] words = {"A", "E", "I", "O", "U"};
    int answer = 0;
    int count = 0;
    boolean found = false;
    
    public int solution(String word) {
        dfs("", word);
        return answer;
    }
    
    private void dfs(String current, String target) {
        if (found) return;
        
        if (!current.equals("")) {
            count++;
            if (current.equals(target)) {
                answer = count;
                found = true;
                return;
            }
        }
        
        if (current.length() == 5) return;
        
        for (String w : words) {
            dfs(current + w, target);
        }
    }
}
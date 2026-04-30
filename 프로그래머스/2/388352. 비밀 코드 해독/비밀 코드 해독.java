/*
• 알고리즘 유형: 조합 / DFS / 완전탐색
• 핵심 개념: 5개 숫자 조합 생성 후 모든 조건 검증
• 시간 복잡도: O(C(n,5) × q.length × 25)
• 공간 복잡도: O(5)
*/

class Solution {
    int answer = 0;
    
    public int solution(int n, int[][] q, int[] ans) {
        int[] selected = new int[5];
        dfs(1, 0, n, selected, q, ans);
        return answer;
    }
    
    private void dfs(int start, int depth, int n, int[] selected, int[][] q, int[] ans) {
        if (depth == 5) {
            if (isPossible(selected, q, ans)) {
                answer++;
            }
            return;
        }
        
        for (int num = start; num <= n; num++) {
            selected[depth] = num;
            dfs(num + 1, depth + 1, n, selected, q, ans);
        }
    }
    
    private boolean isPossible(int[] selected, int[][] q, int[] ans) {
        for (int i = 0; i < q.length; i++) {
            int count = 0;
            
            for (int s : selected) {
                for (int num : q[i]) {
                    if (s == num) {
                        count++;
                        break;
                    }
                }
            }
            
            if (count != ans[i]) {
                return false;
            }
        }
        
        return true;
    }
}
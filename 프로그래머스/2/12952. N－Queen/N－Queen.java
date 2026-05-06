/*
• 알고리즘 유형: DFS / 백트래킹
• 핵심 개념: 한 행에 하나씩 퀸 배치, 열/대각선 검사
• 시간 복잡도: O(N!) 수준
• 공간 복잡도: O(N)
*/

class Solution {
    int answer = 0;
    int[] queens;
    
    public int solution(int n) {
        queens = new int[n];
        dfs(0, n);
        return answer;
    }
    
    private void dfs(int row, int n) {
        if (row == n) {
            answer++;
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (canPlace(row, col)) {
                queens[row] = col;
                dfs(row + 1, n);
            }
        }
    }
    
    private boolean canPlace(int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = queens[prevRow];
            
            if (prevCol == col) return false;
            if (Math.abs(row - prevRow) == Math.abs(col - prevCol)) return false;
        }
        
        return true;
    }
}
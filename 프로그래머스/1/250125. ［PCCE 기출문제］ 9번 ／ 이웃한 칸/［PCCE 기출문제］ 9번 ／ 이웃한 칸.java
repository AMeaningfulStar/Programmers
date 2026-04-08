/*
• 알고리즘 유형: 구현 / 2차원 배열 탐색
• 핵심 개념
 • 방향 배열(dh, dw)
 • 상하좌우 탐색
 • 범위 체크
 • 문자열 비교는 equals()
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        int[] dh = new int[]{0, 1, -1, 0};
        int[] dw = new int[]{1, 0, 0, -1};
        
        for(int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            
            if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if(board[h][w].equals(board[h_check][w_check])) count++;
            }
        }
        
        
        return count;
    }
}
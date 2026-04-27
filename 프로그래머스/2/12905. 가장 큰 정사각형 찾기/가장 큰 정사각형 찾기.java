/*
• 알고리즘 유형: DP
• 핵심 개념
 • 현재 칸이 1일 때만 정사각형 가능
 • board[i][j] = min(왼쪽, 위, 왼쪽위) + 1
 • DP 값은 해당 칸을 오른쪽 아래로 하는 정사각형 한 변 길이
• 시간 복잡도: O(N × M)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[][] board) {
        int xSize = board.length;
        int ySize = board[0].length;
        int size = 0;
        
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                if (board[i][j] == 1) {
                    size = 1;
                }
            }
        }
        
        for (int i = 1; i < xSize; i++) {
            for (int j = 1; j < ySize; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = Math.min(board[i - 1][j - 1],
                                    Math.min(board[i - 1][j], board[i][j - 1])) + 1;
                    
                    size = Math.max(size, board[i][j]);
                }
            }
        }

        return size * size;
    }
}
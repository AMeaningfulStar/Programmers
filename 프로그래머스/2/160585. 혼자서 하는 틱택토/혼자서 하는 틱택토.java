/*
• 알고리즘 유형: 구현 / 상태 검증
• 핵심 개념: O/X 개수 관계, 승리 조건, 마지막 수 검증
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(String[] board) {
        char[][] gameBoard = new char[3][3];
        int oCount = 0;
        int xCount = 0;
        
        for (int i = 0; i < 3; i++) {
            gameBoard[i] = board[i].toCharArray();
            
            for(int j = 0; j < 3; j++) {
                if (gameBoard[i][j] == 'O') oCount++;
                else if (gameBoard[i][j] == 'X') xCount++;
            }
        }
        
        if (!(oCount == xCount || oCount == xCount + 1)) {
            return 0;
        }
        
        boolean oWin = isWin(gameBoard, 'O');
        boolean xWin = isWin(gameBoard, 'X');
        
        if (oWin && xWin) {
            return 0;
        }
        
        if (oWin && oCount != xCount + 1) {
            return 0;
        }
        
        if (xWin && oCount != xCount) {
            return 0;
        }
        
        return 1;
    }
    
    private boolean isWin(char[][] gameBoard, char target) {
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] == target && gameBoard[i][1] == target && gameBoard[i][2] == target) {
                return true;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (gameBoard[0][i] == target && gameBoard[1][i] == target && gameBoard[2][i] == target) {
                return true;
            }
        }
        
        if (gameBoard[0][0] == target && gameBoard[1][1] == target && gameBoard[2][2] == target) {
            return true;
        }
        
        if (gameBoard[0][2] == target && gameBoard[1][1] == target && gameBoard[2][0] == target) {
            return true;
        }
        
        return false;
    }
}
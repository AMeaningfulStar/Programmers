/*
• 알고리즘 유형: 구현 / 시뮬레이션 / 2차원 배열
• 핵심 개념
 • 2x2 같은 블록 찾기
 • 삭제 대상 표시
 • 한 번에 삭제
 • 열 단위 중력 적용
 • 반복 수행
• 시간 복잡도: 반복 횟수에 따라 다르지만 보드 크기에서 충분
• 공간 복잡도: O(m × n)
*/

class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] gameBoard = new char[m][n];
        
        for (int i = 0; i < m; i++) {
            gameBoard[i] = board[i].toCharArray();
        }
        
        int answer = 0;
        
        while (true) {
            boolean[][] mark = new boolean[m][n];
            boolean hasBlock = false;
            
            // 1. 지울 2x2 블록 찾기
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char target = gameBoard[i][j];
                    
                    if (target == '0') continue;
                    
                    if (target == gameBoard[i][j + 1] &&
                        target == gameBoard[i + 1][j] &&
                        target == gameBoard[i + 1][j + 1]) {
                        
                        mark[i][j] = true;
                        mark[i][j + 1] = true;
                        mark[i + 1][j] = true;
                        mark[i + 1][j + 1] = true;
                        hasBlock = true;
                    }
                }
            }
            
            // 더 이상 지울 블록이 없으면 종료
            if (!hasBlock) break;
            
            // 2. 삭제
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mark[i][j]) {
                        gameBoard[i][j] = '0';
                        answer++;
                    }
                }
            }
            
            // 3. 중력 적용
            for (int j = 0; j < n; j++) {
                int emptyRow = m - 1;
                
                for (int i = m - 1; i >= 0; i--) {
                    if (gameBoard[i][j] != '0') {
                        char temp = gameBoard[i][j];
                        gameBoard[i][j] = '0';
                        gameBoard[emptyRow][j] = temp;
                        emptyRow--;
                    }
                }
            }
        }
        
        return answer;
    }
}
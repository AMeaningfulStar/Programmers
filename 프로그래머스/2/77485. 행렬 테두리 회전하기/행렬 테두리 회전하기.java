/*
• 알고리즘 유형: 구현 / 2차원 배열 / 시뮬레이션
• 핵심 개념
 • 행렬 초기화
 • query 좌표 0-based 변환
 • 테두리 회전
 • 회전 중 최솟값 갱신
• 시간 복잡도: O(queries × 테두리 길이)
• 공간 복잡도: O(rows × columns)
*/

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] board = new int[rows][columns];
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                board[i][j] = columns * i + (j + 1);
            }
        }
        
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int x1 = queries[i][0] - 1;
            int y1 = queries[i][1] - 1;
            int x2 = queries[i][2] - 1;
            int y2 = queries[i][3] - 1;
            
            answer[i] = rotate(board, x1, y1, x2, y2);
        }
        
        return answer;
    }
    
    private int rotate(int[][] board, int x1, int y1, int x2, int y2) {
        int temp = board[x1][y1];
        int min = temp;
        
        for (int x = x1; x < x2; x++) {
            board[x][y1] = board[x + 1][y1];
            min = Math.min(min, board[x][y1]);
        }
        
        for (int y = y1; y < y2; y++) {
            board[x2][y] = board[x2][y + 1];
            min = Math.min(min, board[x2][y]);
        }
        
        for (int x = x2; x > x1; x--) {
            board[x][y2] = board[x - 1][y2];
            min = Math.min(min, board[x][y2]);
        }
        
        for (int y = y2; y > y1 + 1; y--) {
            board[x1][y] = board[x1][y - 1];
            min = Math.min(min, board[x1][y]);
        }
        
        board[x1][y1 + 1] = temp;
        
        return min;
    }
}
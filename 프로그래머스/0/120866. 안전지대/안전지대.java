/*
• 알고리즘: 2차원 배열 탐색 (2D Grid Traversal)
• 핵심 개념
 • 2차원 배열 순회
 • 8방향 탐색
 • 범위 체크
 • 위험 지역 표시 후 안전 칸 카운팅
• 시간 복잡도: O(N²)
• 공간 복잡도: O(1) 또는 O(N²)
 • 현재 코드: O(1) 추가 공간
 • 추천 코드: danger 배열 사용 시 O(N²)
*/

class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] dir = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };
        
        boolean[][] danger = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    danger[i][j] = true;
                    
                    for (int[] d : dir) {
                        int ni = i + d[0];
                        int nj = j + d[1];
                        
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                            danger[ni][nj] = true;
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!danger[i][j]) answer++;
            }
        }
        
        return answer;
    }
}
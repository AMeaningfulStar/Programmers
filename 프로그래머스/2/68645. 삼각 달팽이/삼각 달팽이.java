/*
• 알고리즘 유형: 구현 / 시뮬레이션 / 2차원 배열
• 핵심 개념
 • 방향 3개 반복
 • 다음 칸이 범위 밖 또는 이미 채워졌으면 방향 전환
 • 총 채워야 할 개수는 n(n+1)/2
• 시간 복잡도: O(n²)
• 공간 복잡도: O(n²)
*/

import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] dx = {1, 0, -1};
        int[] dy = {0, 1, -1};
        
        int[][] board = new int[n][n];
        int x = 0;
        int y = 0;
        int dir = 0;
        int num = 1;
        int total = n * (n + 1) / 2;
        
        while (num <= total) {
            board[x][y] = num++;
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (nx < 0 || ny < 0 || nx >= n || ny >= n || board[nx][ny] != 0) {
                dir = (dir + 1) % 3;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            x = nx;
            y = ny;
        }
        
        int[] answer = new int[total];
        int idx = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = board[i][j];
            }
        }
        
        return answer;
    }
}
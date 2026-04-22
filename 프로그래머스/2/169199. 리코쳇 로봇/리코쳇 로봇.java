/*
• 알고리즘 유형: BFS / 시뮬레이션 / 격자 탐색
• 핵심 개념
 • 한 칸 이동이 아니라 끝까지 미끄러짐
 • move 함수로 최종 정지 위치 계산
 • 정지 위치를 기준으로 BFS
 • 목표 G에서 멈춰야 성공
• 시간 복잡도: 대략 O(N×M×4×이동거리)
• 공간 복잡도: O(N×M)
*/

import java.util.*;

class Solution {
    public int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();
        
        char[][] gameBoard = new char[n][m];
        int robotX = 0;
        int robotY = 0;
        int goalX = 0;
        int goalY = 0;
        
        for(int i = 0; i < n; i++) {
            gameBoard[i] = board[i].toCharArray();
            
            for(int j = 0; j < m; j++) {
                if(gameBoard[i][j] == 'R') {
                    robotX = i;
                    robotY = j;
                } else if(gameBoard[i][j] == 'G') {
                    goalX = i;
                    goalY = j;
                }
            }
        }
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        int[][] dirs = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        queue.offer(new int[]{robotX, robotY, 0});
        int answer = 0;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int startX = current[0];
            int startY = current[1];
            int dist = current[2];
            
            if(startX == goalX && startY == goalY) {
                return dist;
            }
            
            for(int[] dir : dirs) {
                int[] moveIdx = move(startX, startY, dir, gameBoard);
                int nx = moveIdx[0];
                int ny = moveIdx[1];
                
                if(!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                }
            }      
        }
        
        return -1;
    }
    
    private int[] move(int startX, int startY, int[] dir, char[][] gameBoard) {
        int x = startX;
        int y = startY;
        int n = gameBoard.length;
        int m = gameBoard[0].length;
        
        while(true) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            
            if(nx < 0 || ny < 0 || nx >= n || ny >= m || gameBoard[nx][ny] == 'D') {
                break;
            }
            
            x = nx;
            y = ny;
        }
        
        return new int[]{x, y};
    }
}
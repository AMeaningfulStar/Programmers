/*
• 알고리즘 유형: BFS / 그래프 탐색
• 핵심 개념
 • 격자 최단거리 → BFS
 • 반드시 특정 지점(L)을 거쳐야 함
 • BFS 두 번 수행
• 시간 복잡도: O(N × M)
• 공간 복잡도: O(N × M)
*/

import java.util.*;

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        
        char[][] map = new char[n][m];
        
        int startX = 0, startY = 0;
        int leverX = 0, leverY = 0;
        int exitX = 0, exitY = 0;
        
        
        for(int i = 0; i < n; i++) {
            map[i] = maps[i].toCharArray();
            
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 'S') {
                    startX = i;
                    startY = j;
                } else if(map[i][j] == 'L') {
                    leverX = i;
                    leverY = j;
                } else if(map[i][j] == 'E') {
                    exitX = i;
                    exitY = j;
                }
            }
        }
        
        int dist1 = dfs(startX, startY, 'L', map);
        if(dist1 == -1) return -1;
        
        int dist2 = dfs(leverX, leverY, 'E', map);
        if(dist2 == -1) return -1;
        
        return dist1 + dist2;
    }
    
    private int dfs(int startX, int startY, char target, char[][] map) {
        int n = map.length;
        int m = map[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];
            
            if(map[x][y] == target) {
                return dist;
            }
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= n || ny >= m || nx < 0 || ny < 0) continue;
                if(map[nx][ny] == 'X' || visited[nx][ny]) continue;
                
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny, dist + 1});
            }
        }
        
        return -1;
    }
}
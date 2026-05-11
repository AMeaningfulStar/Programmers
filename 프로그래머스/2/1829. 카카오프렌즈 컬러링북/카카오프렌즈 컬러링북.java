/*
• 알고리즘 유형: BFS / DFS / 격자 탐색
• 핵심 개념: 같은 색 연결 영역 탐색
• 시간 복잡도: O(m × n)
• 공간 복잡도: O(m × n)
*/

import java.util.*;

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    
    boolean[][] visited;
    
    public int[] solution(int m, int n, int[][] picture) {
        visited = new boolean[m][n];
        
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] || picture[i][j] == 0) continue;
                
                int areaSize = dfs(i, j, m, n, picture);
                
                numberOfArea++;
                maxSizeOfOneArea = Math.max(maxSizeOfOneArea, areaSize);
            }
        }
    
        return new int[]{numberOfArea, maxSizeOfOneArea};
    }
    
    private int dfs(int startX, int startY, int m, int n, int[][] picture) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;
        
        int color = picture[startX][startY];
        int size = 1;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                if (visited[nx][ny]) continue;
                if (picture[nx][ny] != color) continue;
                
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny});
                size++;
            }
        }
        
        return size;
    }
}
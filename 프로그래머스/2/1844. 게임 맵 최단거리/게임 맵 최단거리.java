/*
• 알고리즘 유형: BFS / 그래프 탐색 / 격자 최단거리
• 핵심 개념
 • 최단거리 → BFS
 • 큐 사용
 • 방문 배열
 • 4방향 탐색
 • 도착 즉시 종료
• 시간 복잡도: O(N × M)
• 공간 복잡도: O(N × M)
*/

import java.util.*;

class Solution {
    public int[] dx = {-1, 0, 1, 0};
    public int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            
            if(current[0] == n - 1 && current[1] == m - 1) return current[2];
            
            for(int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                
                if(nx < 0 || nx > n - 1 || ny < 0 || ny > m - 1) continue;
                
                if(maps[nx][ny] == 0 || visited[nx][ny]) continue;
                
                queue.add(new int[]{nx, ny, current[2] + 1});
                visited[nx][ny] = true;
            }
        }
        
        return -1;
    }
}
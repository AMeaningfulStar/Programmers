/*
• 알고리즘 유형: BFS / 라벨링 / Set
• 핵심 개념: 연결 컴포넌트 크기 저장, 열별 중복 제거 합산
• 시간 복잡도: O(n × m)
• 공간 복잡도: O(n × m)
*/

import java.util.*;

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] land) {
        int n = land.length;
        int m = land[0].length;
        
        boolean[][] visited = new boolean[n][m];
        int[][] oilId = new int[n][m];
        Map<Integer, Integer> oilSize = new HashMap<>();
        
        int id = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 0 || visited[i][j]) continue;
                
                int size = dfs(i, j, id, land, visited, oilId);
                oilSize.put(id, size);
                id++;
            }
        }
        
        int answer = 0;
        
        for (int col = 0; col < m; col++) {
            Set<Integer> set = new HashSet<>();
            int sum = 0;
            
            for (int row = 0; row < n; row++) {
                int currentId = oilId[row][col];
                
                if(currentId != 0 && !set.contains(currentId)) {
                    set.add(currentId);
                    sum += oilSize.get(currentId);
                }
            }
            
            answer = Math.max(answer, sum);
        }
        
        return answer;
    }
    
    private int dfs(
        int startX,
        int startY,
        int id,
        int[][] land,
        boolean[][] visited,
        int[][] oilId
    ) {
        int n = land.length;
        int m = land[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;
        oilId[startX][startY] = id;
        
        int size = 1;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(visited[nx][ny] || land[nx][ny] == 0) continue;
                
                oilId[nx][ny] = id;
                visited[nx][ny] = true;
                size++;
                
                queue.offer(new int[]{nx, ny});
            }
        }
        
        return size;
    }
}
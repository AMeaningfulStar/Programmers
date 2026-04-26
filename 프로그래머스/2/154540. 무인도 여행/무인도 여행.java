/*
• 알고리즘 유형: BFS / DFS / 격자 탐색
• 핵심 개념
 • X는 바다
 • 숫자 칸은 상하좌우로 연결
 • 연결 영역 하나의 합을 구함
 • 모든 영역 합을 오름차순 정렬
• 시간 복잡도: O(N × M)
• 공간 복잡도: O(N × M)
*/

import java.util.*;

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    
    public int[] solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        
        boolean[][] visited = new boolean[n][m];
        List<Integer> total = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i].charAt(j) == 'X' || visited[i][j]) continue;
                
                int sum = bfs(i, j, maps, visited);
                total.add(sum);
            }
        }
        
        if (total.isEmpty()) {
            return new int[]{-1};
        }
        
        Collections.sort(total);
        
        int[] answer = new int[total.size()];
        for (int i = 0; i < total.size(); i++) {
            answer[i] = total.get(i);
        }
        
        return answer;
    }
    
    private int bfs(int startX, int startY, String[] maps, boolean[][] visited) {
        int n = maps.length;
        int m = maps[0].length();
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;
        
        int sum = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            sum += maps[x].charAt(y) -'0';
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny] || maps[nx].charAt(ny) == 'X') continue;
                
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny});
            }
        }
        
        return sum;
    }
}
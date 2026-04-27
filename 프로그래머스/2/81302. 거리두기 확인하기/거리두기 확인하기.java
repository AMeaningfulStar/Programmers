/*
• 알고리즘 유형: BFS / 격자 탐색
• 핵심 개념: 거리 2 제한, 파티션 X 통과 불가
• 시간 복잡도: O(5 × 5 × P개수) 수준
• 공간 복잡도: O(25)
*/

import java.util.*;

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for (int idx = 0; idx < places.length; idx++) {
            String[] place = places[idx];
            boolean isOk = true;
            
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (place[i].charAt(j) == 'P') {
                        if (!bfs(i, j, place)) {
                            isOk = false;
                            break;
                        }
                    }
                }
                
                if(!isOk) break;
            }
            
            answer[idx] = isOk ? 1 : 0;
        }
        
        return answer;
    }
    
    private boolean bfs (int startX, int startY, String[] place) {
        Queue<int []> queue = new LinkedList<>();
        boolean[][] visited = new boolean[5][5];
        
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];
            
            if (dist >= 2) continue;
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nd = dist + 1;
                
                if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) continue;
                if (visited[nx][ny]) continue;
                if (place[nx].charAt(ny) == 'X') continue;
                
                if (place[nx].charAt(ny) == 'P') {
                    return false;
                }
                
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny, nd});
            }
        }
        
        return true;
    }
}
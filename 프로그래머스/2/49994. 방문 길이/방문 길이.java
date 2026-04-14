/*
• 알고리즘 유형: 구현 / 시뮬레이션 / 좌표
• 핵심 개념
 • 좌표 이동
 • 범위 체크
 • 길(간선) 방문 기록
 • 정방향/역방향을 같은 길로 처리
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        int x = 0;
        int y = 0;
        
        for (char c : dirs.toCharArray()) {
            int nx = x;
            int ny = y;
            
            switch (c) {
                case 'U':
                    ny++;
                    break;
                case 'D':
                    ny--;
                    break;
                case 'R':
                    nx++;
                    break;
                case 'L':
                    nx--;
                    break;
            }
            
            // 범위 밖이면 무시
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }
            
            // 정방향 / 역방향 둘 다 저장
            String path1 = x + "," + y + "," + nx + "," + ny;
            String path2 = nx + "," + ny + "," + x + "," + y;
            
            visited.add(path1);
            visited.add(path2);
            
            // 실제 이동
            x = nx;
            y = ny;
        }
        
        return visited.size() / 2;
    }
}
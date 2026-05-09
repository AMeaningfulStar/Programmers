/*
• 알고리즘 유형: 시뮬레이션 / 해시맵
• 핵심 개념: 시간+좌표별 로봇 수 카운팅
• 시간 복잡도: 전체 로봇 이동 거리 합
• 공간 복잡도: 기록된 시간별 위치 수
*/

import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int[] route : routes) {
            int time = 0;
            
            int[] startPoint = points[route[0] - 1];
            int r = startPoint[0];
            int c = startPoint[1];
            
            record(map, time, r, c);
            
            for (int i = 1; i < route.length; i++) {
                int[] target = points[route[i] - 1];
                int targetR = target[0];
                int targetC = target[1];
                
                while (r != targetR) {
                    if (r < targetR) r++;
                    else r--;
                    
                    time++;
                    record(map, time, r, c);
                }
                
                while (c != targetC) {
                    if (c < targetC) c++;
                    else c--;
                    
                    time++;
                    record(map, time, r, c);
                }
            }
        }
        
        int answer = 0;
        
        for (int count : map.values()) {
            if (count >= 2) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private void record(Map<String, Integer> map, int time, int r, int c) {
        String key = time + "," + r + "," + c;
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
}
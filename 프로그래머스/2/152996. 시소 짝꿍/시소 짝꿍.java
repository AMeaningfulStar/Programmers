/*
• 알고리즘 유형: 해시맵 / 카운팅
• 핵심 개념
 • 비율 관계 (1:1, 2:3, 1:2, 3:4)
 • 이전 값과 매칭
 • 빈도수 저장
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        
        Map<Double, Long> map = new HashMap<>();
        
        for(int w : weights) {
            double weight = (double) w;
            map.put(weight, 0L);
        }
        
        for (int w : weights) {
            double weight = (double) w;
            
            // 가능한 비율 체크
            answer += map.getOrDefault(weight, 0L);           // 1:1
            answer += map.getOrDefault(weight * 2 / 3, 0L);   // 2:3
            answer += map.getOrDefault(weight / 2, 0L);       // 1:2
            answer += map.getOrDefault(weight * 3 / 2, 0L);
            answer += map.getOrDefault(weight * 3 / 4, 0L);   // 3:4
            answer += map.getOrDefault(weight * 2, 0L);
            answer += map.getOrDefault(weight * 4 / 3, 0L);
            
            // 현재 weight 추가
            map.put(weight, map.getOrDefault(weight, 0L) + 1);
        }
        
        return answer;
    }
}
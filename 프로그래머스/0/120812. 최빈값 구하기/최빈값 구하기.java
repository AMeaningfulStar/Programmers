/*
• 알고리즘: 해시맵 기반 빈도 계산
• 핵심 개념
 • 빈도수 카운팅
 • 최대값 추적
 • 중복 최대값 판별
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int max = 0;
        int answer = -1;
        int count = 0;
        
        for (int key : map.keySet()) {
            int freq = map.get(key);
            
            if (freq > max) {
                max = freq;
                answer = key;
                count = 1;
            } else if (freq == max) {
                count++;
            }
        }
        
        if (count > 1) return -1;
        
        return answer;
    }
}
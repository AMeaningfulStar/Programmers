/*
• 알고리즘 유형: 구현 / 시뮬레이션
• 핵심 개념 목록
 • cache hit = 1
 • cache miss = 5
 • 대소문자 무시 → 소문자 변환
 • LRU = 가장 오래 안 쓴 것 제거
 • 최근 사용한 데이터는 맨 뒤로 이동
• 시간 복잡도: O(N × cacheSize)
• 공간 복잡도: O(cacheSize)
*/

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        
        int answer = 0;
        List<String> cache = new ArrayList<>();
        
        for (String city : cities) {
            city = city.toLowerCase();
            
            if (cache.contains(city)) {
                // cache hit
                cache.remove(city);
                cache.add(city);
                answer += 1;
            } else {
                // cache miss
                if (cache.size() == cacheSize) {
                    cache.remove(0);
                }
                cache.add(city);
                answer += 5;
            }
        }
        
        return answer;
    }
}
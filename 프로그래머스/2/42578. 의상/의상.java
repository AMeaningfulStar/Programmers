/*
• 알고리즘 유형: HashMap + 조합
• 핵심 개념
 • 종류별 개수 세기
 • 각 종류에서 “입는다 / 안 입는다” 선택
 • 곱의 법칙
 • 전체에서 공집합 1개 제외
• 시간 복잡도: O(N)
• 공간 복잡도: O(K)
 • K는 옷 종류 수
*/

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
        
        int answer = 1;
        
        for (int count : map.values()) {
            answer *= (count + 1);
        }
        
        return answer - 1;
    }
}
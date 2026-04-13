/*
• 알고리즘 유형: 문자열 파싱 / 정렬 / 집합
• 핵심 개념
 • 문자열에서 집합 단위 분리
 • 집합 크기 기준 정렬
 • 이전에 없던 숫자만 순서대로 추가
• 시간 복잡도: O(N log N) 정도
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 바깥 {{ }} 제거
        s = s.substring(2, s.length() - 2);
        
        // 집합 단위로 분리
        String[] sets = s.split("\\},\\{");
        
        // 원소 개수 기준 정렬
        Arrays.sort(sets, Comparator.comparingInt(String::length));
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        
        for (String set : sets) {
            String[] nums = set.split(",");
            
            for (String num : nums) {
                int value = Integer.parseInt(num);
                
                if (!seen.contains(value)) {
                    seen.add(value);
                    result.add(value);
                }
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}
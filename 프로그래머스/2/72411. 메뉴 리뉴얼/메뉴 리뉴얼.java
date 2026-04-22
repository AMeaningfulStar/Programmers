/*
• 알고리즘 유형: 조합 / DFS / 해시맵
• 핵심 개념
 • 주문 문자열 정렬
 • 길이 c인 모든 조합 생성
 • 조합 빈도수 세기
 • 각 course 길이별 최댓값 조합 선택
• 시간 복잡도: 주문마다 조합 생성량에 비례
• 공간 복잡도: 조합 저장 수에 비례
*/

import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> result = new ArrayList<>();
        
        for(int c : course) {
            Map<String, Integer> countMap = new HashMap<>();
            
            for(String order : orders) {
                char[] chars = order.toCharArray();
                Arrays.sort(chars);
                
                combination(chars, 0, new StringBuilder(), c, countMap);
            }
            
            int max = 0;
            
            for(int count : countMap.values()) {
                if(count >= 2) {
                    max = Math.max(max, count);
                }
            }
            
            for(String key : countMap.keySet()) {
                if(countMap.get(key) == max && max >= 2) {
                    result.add(key);
                }
            }
        }
        
        Collections.sort(result);
        
        return result.toArray(new String[0]);
    }
    
    private void combination(char[] chars, int start, StringBuilder current, int targetLen, Map<String, Integer> countMap) {
        if(current.length() == targetLen) {
            String menu = current.toString();
            countMap.put(menu, countMap.getOrDefault(menu, 0) + 1);
            return;
        }
        
        for(int i = start; i < chars.length; i++) {
            current.append(chars[i]);
            combination(chars, i + 1, current, targetLen, countMap);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
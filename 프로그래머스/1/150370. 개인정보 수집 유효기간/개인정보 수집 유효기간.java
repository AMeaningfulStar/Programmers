/*
• 알고리즘 유형: 구현 / 날짜 변환
• 핵심 개념
 • 모든 날짜를 총 일수로 변환
 • 약관 개월 수는 28 * 개월 수
 • today >= expire면 파기
• 시간 복잡도: O(N)
• 공간 복잡도: O(M)
*/

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String term : terms) {
            String[] str = term.split(" ");
            map.put(str[0], Integer.parseInt(str[1]));
        }
        
        int todayValue = toDays(today);
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String[] str = privacies[i].split(" ");
            String date = str[0];
            String type = str[1];
            
            int collectedDay = toDays(date);
            int expireDay = collectedDay + map.get(type) * 28;
            
            if (todayValue >= expireDay) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
    
    private int toDays(String date) {
        int y = Integer.parseInt(date.substring(0, 4));
        int m = Integer.parseInt(date.substring(5, 7));
        int d = Integer.parseInt(date.substring(8, 10));
        
        return y * 12 * 28 + m * 28 + d;
    }
}
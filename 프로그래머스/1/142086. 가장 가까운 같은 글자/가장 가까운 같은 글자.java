/*
• 알고리즘: 해시맵 기반 최근 위치 추적
• 핵심 개념
 • 문자별 마지막 등장 위치 저장
 • 현재 인덱스와 이전 인덱스의 차 계산
 • 처리 후 최신 위치로 갱신
• 시간 복잡도: O(N)
• 공간 복잡도: O(K)
 • K는 서로 다른 문자 개수
*/

import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            }
        }
        
        return answer;
    }
}

/*
import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (map.containsKey(c)) {
                answer[i] = i - map.get(c);
            } else {
                answer[i] = -1;
            }
            
            map.put(c, i);
        }
        
        return answer;
    }
}
*/
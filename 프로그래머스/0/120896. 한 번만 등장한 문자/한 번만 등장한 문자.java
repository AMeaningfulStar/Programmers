/*
• 알고리즘: 빈도수 카운팅 + 정렬
• 핵심 개념
 • Map / 배열 카운팅
 • 조건 필터링 (count == 1)
 • 정렬
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        List<Character> list = new ArrayList<>();
        
        for(char c : map.keySet()) {
            if(map.get(c) == 1) {
                list.add(c);
            }
        }
        
        Collections.sort(list);
        
        StringBuilder answer = new StringBuilder();
        
        for(char c : list) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}

/*
class Solution {
    public String solution(String s) {
        int[] count = new int[26];
        
        for(char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < 26; i++) {
            if(count[i] == 1) {
                answer.append((char)(i + 'a'));
            }
        }
        
        return answer.toString();
    }
}
*/
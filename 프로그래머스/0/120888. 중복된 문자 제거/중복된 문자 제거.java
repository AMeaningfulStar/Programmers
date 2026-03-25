/*
• 알고리즘: 문자열 중복 제거 (Duplicate Removal)
• 핵심 개념
 • 순서 유지
 • 중복 체크 (Set / boolean 배열)
 • 탐색 최적화
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> set = new HashSet<>();
        
        for(char c : my_string.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}

/*
다른 풀이
class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        boolean[] visited = new boolean[128]; // ASCII
        
        for(char c : my_string.toCharArray()) {
            if(!visited[c]) {
                visited[c] = true;
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}
*/
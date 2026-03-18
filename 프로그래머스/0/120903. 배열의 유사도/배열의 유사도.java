/*
• 알고리즘: 해시 기반 탐색 (Hash-based Search)
• 핵심 개념
 • 공통 요소 찾기
 • HashSet을 이용한 빠른 탐색 (O(1))
 • contains 연산 최적화
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String str: s1) {
            if(Arrays.asList(s2).contains(str)) {
                answer += 1;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s2));
        int answer = 0;
        
        for(String str : s1) {
            if(set.contains(str)) {
                answer++;
            }
        }
        
        return answer;
    }
}
*/
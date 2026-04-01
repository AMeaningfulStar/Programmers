/*
• 알고리즘: 자릿수 분해
• 핵심 개념
 • 나머지 연산 (% 10)
 • 정수 나눗셈 (/ 10)
 • 반복 종료 조건
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n != 0) {
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(char c : String.valueOf(n).toCharArray()) {
            answer += c - '0';
        }
        
        return answer;
    }
}

2.
return String.valueOf(n)
             .chars()
             .map(c -> c - '0')
             .sum();
*/
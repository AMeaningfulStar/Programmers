/*
• 알고리즘: 문자열 파싱 + 누적 계산
• 핵심 개념
 • 공백 기준 문자열 분리 (split)
 • 숫자 누적 합 계산
 • "Z" 등장 시 직전 숫자 취소
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
(토큰 배열 저장 기준)
*/

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] s_arr = s.split(" ");
        
        for(int i = 0; i < s_arr.length; i++) {
            if(s_arr[i].equals("Z")) {
                answer -= Integer.parseInt(s_arr[i - 1]);
            } else {
                 answer += Integer.parseInt(s_arr[i]);
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : s.split(" ")) {
            if (token.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        int answer = 0;
        for (int num : stack) {
            answer += num;
        }
        
        return answer;
    }
}
*/
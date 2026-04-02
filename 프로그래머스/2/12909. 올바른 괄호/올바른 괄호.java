/*
• 알고리즘: 괄호 검증 / 스택 패턴
• 핵심 개념
 • 열린 괄호 개수 관리
 • 닫는 괄호가 먼저 나오면 실패
 • 마지막에 개수가 0이어야 성공
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
            }
            
            if (count < 0) return false;
        }
        
        return count == 0;
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}
*/
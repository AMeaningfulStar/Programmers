/*
• 알고리즘 유형: 스택 + 시뮬레이션
• 핵심 개념
 • 괄호 매칭
 • 회전 ((i + j) % n)
 • 스택 push / pop
• 시간 복잡도: O(N²)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (isValid(s, i)) answer++;
        }
        
        return answer;
    }
    
    private boolean isValid(String s, int start) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt((start + i) % n);
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
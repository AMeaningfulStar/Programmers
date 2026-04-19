/*
• 알고리즘 유형: 그리디 / 스택
• 핵심 개념
 • 앞자리를 최대한 크게 만든다
 • 현재 숫자보다 작은 이전 숫자는 제거
 • 스택으로 이전 숫자 관리
 • 끝까지 갔는데 k가 남으면 뒤에서 제거
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int remove = 0;
        
        for (char c : number.toCharArray()) {
            while (!stack.isEmpty() && remove < k && stack.peek() < c) {
                stack.pop();
                remove++;
            }
            stack.push(c);
        }
        
        // 아직 덜 지웠으면 뒤에서 제거
        while (remove < k) {
            stack.pop();
            remove++;
        }
        
        StringBuilder answer = new StringBuilder();
        for (char c : stack) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}

/*
다른 풀이
1.
import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        int remove = 0;

        for (char c : number.toCharArray()) {
            while (!stack.isEmpty() && remove < k && stack.peekLast() < c) {
                stack.pollLast();
                remove++;
            }
            stack.offerLast(c);
        }

        while (remove < k) {
            stack.pollLast();
            remove++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
*/
/*
• 알고리즘 유형: 스택 / 시뮬레이션
• 핵심 개념
 • 컨베이어 상자는 1부터 순서대로 옴
 • 바로 실을 수 없으면 스택 보관
 • 스택 top이 필요 상자면 꺼냄
 • 더 이상 못 꺼내면 종료
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        
        for (int num = 1; num <= order.length; num++) {
            if (order[idx] == num) {
                idx++;
            } else {
                stack.push(num);
            }
            
            while (!stack.isEmpty() && idx < order.length && stack.peek() == order[idx]) {
                stack.pop();
                idx++;
            }
        }
        
        return idx;
    }
}

/*
내 풀이
1.
import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        int num = 1;
        int answer = 0;
        
        while (num <= order.length) {
            if (order[idx] == num) {
                answer++;
                idx++;
                num++;
            } else {
                stack.push(num);
                num++;
            }
            
            while (!stack.isEmpty() && idx < order.length && stack.peek() == order[idx]) {
                stack.pop();
                answer++;
                idx++;
            }
        }
        
        return answer;
    }
}
*/
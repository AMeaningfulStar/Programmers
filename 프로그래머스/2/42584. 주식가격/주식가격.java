/*
• 알고리즘 유형: 구현 / (또는) 스택
• 핵심 개념
 • 현재 값 기준으로 뒤 탐색
 • 가격이 떨어지는 순간 종료
 • 스택으로도 최적화 가능
• 시간 복잡도:
 • 현재 코드: O(N²)
 • 스택 풀이: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++) {
            int second = 0;
            
            for(int j = i + 1; j < prices.length; j++) {
                second++;
                if(prices[i] > prices[j]) break;
            }
            
            answer[i] = second;
        }
        
        return answer;
    }
}

/*
다른 풀이
1. stack 풀이
import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            
            stack.push(i);
        }
        
        // 끝까지 안 떨어진 경우
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - 1 - idx;
        }
        
        return answer;
    }
}
*/
/*
• 알고리즘 유형: 스택 / 오큰수 / 단조 스택
• 핵심 개념
 • 아직 답을 못 찾은 인덱스를 스택에 저장
 • 현재 값이 더 크면 정답 확정
 • 인덱스를 스택에 저장해야 answer 채우기 쉬움
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // 현재 값이 더 크면 계속 pop
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int idx = stack.pop();
                answer[idx] = numbers[i];
            }
            
            stack.push(i);
        }
        
        return answer;
    }
}
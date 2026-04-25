/*
• 알고리즘 유형: 완전탐색 / 문자열 파싱 / 구현
• 핵심 개념
 • 숫자와 연산자 분리
 • 연산자 우선순위 6가지 완전탐색
 • 우선순위별 리스트 복사 후 계산
 • 결과 절댓값 최댓값 갱신
• 시간 복잡도: O(6 × 연산자 수²)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public long solution(String expression) {
        List<Long> numbers = new ArrayList<>();
        List<Character> ops = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : expression.toCharArray()) {
            if (c >= '0' && c <= '9') {
                sb.append(c);
            } else {
                numbers.add(Long.parseLong(sb.toString()));
                sb.setLength(0);
                ops.add(c);
            }
        }
        
        numbers.add(Long.parseLong(sb.toString()));
        
        char[][] priorities = {
            {'+', '-', '*'},
            {'+', '*', '-'},
            {'-', '+', '*'},
            {'-', '*', '+'},
            {'*', '+', '-'},
            {'*', '-', '+'}
        };
        
        long answer = 0;
        
        for (char[] priority : priorities) {
            List<Long> nums = new ArrayList<>(numbers);
            List<Character> opList = new ArrayList<>(ops);
            
            for (char targetOp : priority) {
                for (int i = 0; i < opList.size(); i++) {
                    if (opList.get(i) == targetOp) {
                        long result = calculate(nums.get(i), nums.get(i + 1), targetOp);
                        
                        nums.set(i, result);
                        nums.remove(i + 1);
                        opList.remove(i);
                        
                        i--;
                    }
                }
            }
            
            answer = Math.max(answer, Math.abs(nums.get(0)));
        }
        
        return answer;
    }
    
    private long calculate(long a, long b, char op) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        return a * b;
    }
}
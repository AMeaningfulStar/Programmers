/*
• 알고리즘 유형: 비트 연산 / 수학
• 핵심 개념
 • 짝수는 x + 1
 • 홀수는 오른쪽에서 가장 가까운 0 찾기
 • 그 0을 1로, 오른쪽 1을 0으로 교체
• 시간 복잡도: O(N) 수준
• 공간 복잡도: O(1)
*/

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            long x = numbers[i];
            
            // 짝수면 마지막 비트만 바꾸면 됨
            if (x % 2 == 0) {
                answer[i] = x + 1;
            } 
            // 홀수면 비트 규칙 적용
            else {
                long bit = 1;
                
                // 오른쪽에서 처음 만나는 0 찾기
                while ((x & bit) != 0) {
                    bit <<= 1;
                }
                
                // 그 0을 1로 바꾸고, 바로 오른쪽 1을 0으로 바꿈
                answer[i] = x + bit - (bit >> 1);
            }
        }
        
        return answer;
    }
}
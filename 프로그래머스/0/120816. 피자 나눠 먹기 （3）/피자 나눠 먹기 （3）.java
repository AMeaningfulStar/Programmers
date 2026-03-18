/*
• 알고리즘: 산술 연산 (Arithmetic Calculation)
• 핵심 개념
 • 정수 나눗셈을 이용한 몫 계산
 • 올림 처리 공식 ((n + divisor - 1) / divisor)
 • 최소 개수 계산 문제
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int slice, int n) {
        return (n + (slice - 1)) / slice;
    }
}
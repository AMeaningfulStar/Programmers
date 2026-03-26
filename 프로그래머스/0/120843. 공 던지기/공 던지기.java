/*
• 알고리즘: 원형 배열 (Circular Array)
• 핵심 개념
 • 인덱스 이동 (* 2)
 • 시작 위치 고려 (k - 1)
 • 나머지 연산 (%)
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] numbers, int k) {
        int idx = ((k - 1) * 2) % numbers.length;
        return numbers[idx];
    }
}
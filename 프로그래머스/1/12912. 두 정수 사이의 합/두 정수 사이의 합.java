/*
• 알고리즘: 수학 공식 (Arithmetic Series)
 • (첫값 + 끝값) × 개수 / 2
• 핵심 개념
 • 등차수열 합
 • 시작값/끝값 활용
 • 개수 계산
• 시간 복잡도:
 • 반복문: O(N)
 • 공식: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public long solution(int a, int b) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        
        return (min + max) * (max - min + 1) / 2;
    }
}
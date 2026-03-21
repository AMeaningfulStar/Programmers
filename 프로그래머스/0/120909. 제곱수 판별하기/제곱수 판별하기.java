/*
• 알고리즘: 수학 판별 (Mathematical Check)
• 핵심 개념
 • 제곱근 계산 (Math.sqrt)
 • 정수 여부 판별
 • 완전제곱수 조건 (x * x == n)
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n ? 1 : 2;
    }
}
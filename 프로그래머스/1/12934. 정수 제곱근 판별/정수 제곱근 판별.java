/*
• 알고리즘: 수학 판별 (Mathematical Check)
• 핵심 개념
 • 제곱근 계산 (Math.sqrt)
 • 완전제곱수 판별
 • 다음 제곱수 계산
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public long solution(long n) {
        long root = (long) Math.sqrt(n);
        
        if (root * root != n) return -1;
        
        return (root + 1) * (root + 1);
    }
}
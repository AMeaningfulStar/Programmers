/*
• 알고리즘 유형: 수학 / 재귀적 규칙 판별
• 핵심 개념: 5진법 자리 중 2가 있으면 0
• 시간 복잡도: O((r - l + 1) × n)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n, long l, long r) {
        int answer = 0;
        
        for (long i = l; i <= r; i++) {
            if (isOne(i - 1)) {
                answer++;
            }
        }
    
        return answer;
    }
    
    private boolean isOne(long pos) {
        while (pos > 0) {
            if (pos % 5 == 2) {
                return false;
            }
            
            pos /= 5;
        }
        
        return true;
    }
}
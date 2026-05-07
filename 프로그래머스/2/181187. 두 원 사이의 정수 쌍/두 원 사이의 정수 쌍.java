/*
• 알고리즘 유형: 수학 / 좌표
• 핵심 개념: x 고정 후 가능한 y 범위 계산
• 시간 복잡도: O(r2)
• 공간 복잡도: O(1)
*/

class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        long rr1 = (long) r1 * r1;
        long rr2 = (long) r2 * r2;
        
        for (long x = 1; x <= r2; x++) {
            long maxY = (long) Math.floor(Math.sqrt(rr2 - x * x));
            
            long minY;
            if (rr1 - x * x <= 0) {
                minY = 0;
            } else {
                minY = (long) Math.ceil(Math.sqrt(rr1 - x * x));
            }
            
            answer += maxY - minY + 1;
        }
        
        return answer * 4;
    }
}
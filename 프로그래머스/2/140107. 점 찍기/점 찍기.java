/*
• 알고리즘 유형: 수학 / 좌표
• 핵심 개념: x를 k 단위로 고정하고 가능한 y 개수 계산
• 시간 복잡도: O(d / k)
• 공간 복잡도: O(1)
*/

class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        long dd = (long) d * d;
        
        for (long x = 0; x <= d; x += k) {
            long maxY = (long) Math.sqrt(dd - x * x);
            answer += maxY / k + 1;
        }
        
        return answer;
    }
}
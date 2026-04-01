/*
• 알고리즘: 자릿수 분해
• 핵심 개념
 • % 10 → 마지막 자리
 • / 10 → 자리 제거
 • 자연스럽게 reverse 처리
• 시간 복잡도: O(log N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int[] solution(long n) {
        if (n == 0) return new int[]{0};
        
        int[] answer = new int[String.valueOf(n).length()];
        int idx = 0;
        
        while (n > 0) {
            answer[idx++] = (int)(n % 10);
            n /= 10;
        }
        
        return answer;
    }
}
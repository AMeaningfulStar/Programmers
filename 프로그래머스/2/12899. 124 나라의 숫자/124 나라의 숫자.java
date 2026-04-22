/*
• 알고리즘 유형: 수학 / 진법 변환
• 핵심 개념
 • 0이 없는 3진법
 • 나머지 0 → “4” 처리
 • n– 보정
 • 결과 reverse
• 시간 복잡도: O(log n)
• 공간 복잡도: O(log n)
*/

class Solution {
    public String solution(int n) {
        String[] role = {"4", "1", "2"};
        StringBuilder answer = new StringBuilder();
        
        while (n > 0) {
            int mod = n % 3;
            
            answer.append(role[mod]);
            
            if (mod == 0) {
                n--;
            }
            
            n /= 3;
        }
        
        return answer.reverse().toString();
    }
}
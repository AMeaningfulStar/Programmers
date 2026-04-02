/*
• 알고리즘: 진법 변환 (Base Conversion)
• 핵심 개념
 • 10진수 → 3진수 변환 (n % 3, n /= 3)
 • 뒤집힌 3진수 해석
 • 자릿수 누적 계산 (answer = answer * 3 + digit)
• 시간 복잡도: O(log₃N)
• 공간 복잡도:
 • 현재 코드: O(log₃N)
 • 개선 코드: O(1)
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer = answer * 3 + (n % 3);
            n /= 3;
        }
        
        return answer;
    }
}
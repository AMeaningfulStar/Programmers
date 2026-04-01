/*
• 알고리즘: 약수 탐색 (Divisor Search)
• 핵심 개념
 • 약수 쌍
 • √N까지만 탐색
 • 중복 처리
• 시간 복잡도:
 • 기본: O(N)
 • 최적화: O(√N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                answer += i;
                
                if (i != n / i) {
                    answer += n / i;
                }
            }
        }
        
        return answer;
    }
}
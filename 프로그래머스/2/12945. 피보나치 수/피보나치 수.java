/*
• 알고리즘: 동적 계획법 (DP)
• 핵심 개념
 • 점화식: F(n) = F(n-1) + F(n-2)
 • 이전 결과 재사용
 • 매 단계 모듈러 연산 (% 1234567)
• 시간 복잡도: O(N)
• 공간 복잡도:
 • 배열 방식: O(N)
 • 변수 2개 방식: O(1)
*/

class Solution {
    public int solution(int n) {
        int[] dp = new int[n + 1];
        
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        
        return dp[n];
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int n) {
        if (n < 2) return n;
        
        int a = 0;
        int b = 1;
        
        for (int i = 2; i <= n; i++) {
            int next = (a + b) % 1234567;
            a = b;
            b = next;
        }
        
        return b;
    }
}
*/
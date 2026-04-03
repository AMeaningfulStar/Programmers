/*
• 알고리즘 유형: DP (피보나치)
• 핵심 개념
 • 현재 값 = 이전 2개 값의 합
 • 점화식 도출
 • mod 연산 필수
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public long solution(int n) {
        long[] dp = new long[n + 1];
        
        dp[1] = 1;
        if (n >= 2) dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        
        return dp[n];
    }
}
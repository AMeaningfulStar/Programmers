/*
• 알고리즘 유형: DP / 타일링
• 핵심 개념: 기본 패턴 + 특수 패턴 누적
• 시간 복잡도: O(n²)
• 공간 복잡도: O(n)
*/

class Solution {
    public int solution(int n) {
        if (n % 2 != 0) return 0;
        
        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];
        
        dp[0] = 1;
        dp[2] = 3;
        
        long sum = dp[0]; // dp[i-4]부터 필요한 누적합
        
        for (int i = 4; i <= n; i += 2) {
            dp[i] = (dp[i - 2] * 3 + sum * 2) % MOD;
            sum = (sum + dp[i - 2]) % MOD;
        }
        
        return (int) dp[n];
    }
}
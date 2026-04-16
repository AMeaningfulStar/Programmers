/*
• 알고리즘 유형: DP
• 핵심 개념
 • 마지막 타일이 세로 1개인지, 가로 2개인지로 경우 분리
 • 점화식: dp[n] = dp[n-1] + dp[n-2]
 • 매 단계마다 1000000007로 나머지 처리
• 시간 복잡도: O(n)
• 공간 복잡도: O(n) 또는 O(1)
*/

class Solution {
    public int solution(int n) {
        int MOD = 1000000007;
        
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        
        return dp[n];
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int n) {
        int MOD = 1000000007;
        
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int a = 1; // dp[1]
        int b = 2; // dp[2]
        
        for (int i = 3; i <= n; i++) {
            int next = (a + b) % MOD;
            a = b;
            b = next;
        }
        
        return b;
    }
}
*/
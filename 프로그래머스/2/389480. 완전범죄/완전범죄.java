/*
• 알고리즘 유형: DP
• 핵심 개념: dp[b] = B 흔적이 b일 때 최소 A 흔적
• 시간 복잡도: O(info.length × m)
• 공간 복잡도: O(m)
*/

import java.util.*;

class Solution {
    public int solution(int[][] info, int n, int m) {
        int INF = 1_000_000;
        
        int[] dp = new int[m];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        
        for (int[] item : info) {
            int aTrace = item[0];
            int bTrace = item[1];
            
            int[] next = new int[m];
            Arrays.fill(next, INF);
            
            for (int b = 0; b < m; b++) {
                if (dp[b] == INF) continue;
                
                // 1. A가 훔치는 경우
                int nextA = dp[b] + aTrace;
                if (nextA < n) {
                    next[b] = Math.min(next[b], nextA);
                }
                
                // 2. B가 훔치는 경우
                int nextB = b + bTrace;
                if (nextB < m) {
                    next[nextB] = Math.min(next[nextB], dp[b]);
                }
            }
            
            dp = next;
        }
        
        int answer = INF;
        for (int a : dp) {
            answer = Math.min(answer, a);
        }
        
        return answer == INF ? -1 : answer;
    }
}
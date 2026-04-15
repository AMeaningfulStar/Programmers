/*
• 알고리즘 유형: DP
• 핵심 개념
 • 같은 열 연속 선택 불가
 • 현재 칸 = 현재 값 + 이전 행 다른 열 최댓값
 • 마지막 행 최댓값이 정답
• 시간 복잡도: O(N)
• 공간 복잡도: O(1) 또는 O(N)
*/

class Solution {
    public int solution(int[][] land) {
        int n = land.length;
        int[][] dp = new int[n][4];

        // 첫 번째 행 초기화
        for (int j = 0; j < 4; j++) {
            dp[0][j] = land[0][j];
        }

        // 두 번째 행부터 누적
        for (int i = 1; i < n; i++) {
            dp[i][0] = land[i][0] + Math.max(dp[i - 1][1], Math.max(dp[i - 1][2], dp[i - 1][3]));
            dp[i][1] = land[i][1] + Math.max(dp[i - 1][0], Math.max(dp[i - 1][2], dp[i - 1][3]));
            dp[i][2] = land[i][2] + Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][3]));
            dp[i][3] = land[i][3] + Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2]));
        }

        return Math.max(dp[n - 1][0],
                Math.max(dp[n - 1][1],
                Math.max(dp[n - 1][2], dp[n - 1][3])));
    }
}
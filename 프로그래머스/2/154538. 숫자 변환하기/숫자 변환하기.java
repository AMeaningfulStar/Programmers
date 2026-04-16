/*
• 알고리즘 유형: BFS / DP
• 핵심 개념
 • 최소 횟수 → BFS
 • 또는 dp[i] = 최소 연산 횟수
 • +n, *2, *3 연산
• 시간 복잡도: O(y) 수준
• 공간 복잡도: O(y)
*/

import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];
        
        queue.offer(new int[]{x, 0});
        visited[x] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int count = current[1];
            
            if (value == y) return count;
            
            int next1 = value + n;
            int next2 = value * 2;
            int next3 = value * 3;
            
            if (next1 <= y && !visited[next1]) {
                visited[next1] = true;
                queue.offer(new int[]{next1, count + 1});
            }
            if (next2 <= y && !visited[next2]) {
                visited[next2] = true;
                queue.offer(new int[]{next2, count + 1});
            }
            if (next3 <= y && !visited[next3]) {
                visited[next3] = true;
                queue.offer(new int[]{next3, count + 1});
            }
        }
        
        return -1;
    }
}

/*
다른 풀이
1.
import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[x] = 0;
        
        for (int i = x + 1; i <= y; i++) {
            if (i - n >= x && dp[i - n] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i - n] + 1);
            }
            if (i % 2 == 0 && i / 2 >= x && dp[i / 2] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0 && i / 3 >= x && dp[i / 3] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        
        return dp[y] == Integer.MAX_VALUE ? -1 : dp[y];
    }
}
*/
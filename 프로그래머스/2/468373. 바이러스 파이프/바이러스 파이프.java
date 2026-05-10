/*
• 알고리즘 유형: DFS / BFS / 완전탐색 / 트리
• 핵심 개념: 파이프 타입 순서 완전탐색, 타입별 감염 확산
• 시간 복잡도: 대략 O(3^k × (n + edges))
• 공간 복잡도: O(n)
*/

import java.util.*;

class Solution {
    List<int[]>[] graph;
    int answer = 0;
    
    public int solution(int n, int infection, int[][] edges, int k) {
        graph = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            int type = edge[2];
            
            graph[a].add(new int[]{b, type});
            graph[b].add(new int[]{a, type});
        }
        
        boolean[] infected = new boolean[n + 1];
        infected[infection] = true;
        
        dfs(0, k, infected);
        
        return answer;
    }
    
    private void dfs(int depth, int k, boolean[] infected) {
        answer = Math.max(answer, countInfected(infected));
        
        if (depth == k) {
            return;
        }
        
        for (int type = 1; type <= 3; type++) {
            boolean[] nextInfected = infected.clone();
            spread(nextInfected, type);
            dfs(depth + 1, k, nextInfected);
        }
    }
    
    private void spread(boolean[] infected, int type) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i < infected.length; i++) {
            if (infected[i]) {
                queue.offer(i);
            }
        }
        
        boolean[] visited = infected.clone();
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (int[] nextInfo : graph[current]) {
                int next = nextInfo[0];
                int edgeType = nextInfo[1];
                
                if (edgeType != type) continue;
                if (visited[next]) continue;
                
                visited[next] = true;
                infected[next] = true;
                queue.offer(next);
            }
        }
    }
    
    private int countInfected(boolean[] infected) {
        int count = 0;
        
        for (int i = 0; i < infected.length; i++) {
            if (infected[i]) count++;
        }
        
        return count;
    }
}
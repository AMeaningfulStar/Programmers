/*
• 알고리즘 유형: 그래프 / BFS(또는 DFS) / 완전탐색
• 핵심 개념
 • 전선 하나씩 제거
 • 제거된 상태에서 BFS/DFS
 • 한쪽 컴포넌트 노드 수 세기
 • 차이의 최솟값 갱신
• 시간 복잡도: O(n²) 수준
 (전선마다 BFS 한 번)
• 공간 복잡도: O(n)
*/

import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        // Step.1 인접 리스트 만들기
        List<Integer>[] graph = new ArrayList[n + 1];
        
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList();
        }
        
        for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        // Step.2 전선 하나씩 끊어보기
        int answer = Integer.MAX_VALUE;
        
        for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            
            int count = dfs(a, b, graph, n);
            int diff = Math.abs(count - (n - count));
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private int dfs(int start, int blocked, List<Integer>[] graph, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        
        queue.offer(start);
        visited[start] = true;
        int count = 1;
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            
            for(int next: graph[current]) {
                if((current == start && next == blocked) || (current == blocked && next == start)) {
                    continue;
                }
                
                if(!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                    count++;
                }
            }
        }
        
        return count;
    }
}

/*
다른 풀이
1.
import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph[a].add(b);
            graph[b].add(a);
        }
        
        int answer = Integer.MAX_VALUE;
        
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            
            int count = bfs(a, b, graph, n);
            int diff = Math.abs(count - (n - count));
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private int bfs(int cutA, int cutB, List<Integer>[] graph, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        
        queue.offer(cutA);
        visited[cutA] = true;
        int count = 1;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (int next : graph[current]) {
                // 끊은 간선이면 건너뜀
                if ((current == cutA && next == cutB) || (current == cutB && next == cutA)) {
                    continue;
                }
                
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                    count++;
                }
            }
        }
        
        return count;
    }
}
*/
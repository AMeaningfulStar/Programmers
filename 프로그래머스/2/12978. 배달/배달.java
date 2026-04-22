/*
• 알고리즘 유형: 다익스트라 / 그래프 최단거리
• 핵심 개념
 • 가중치 있는 그래프
 • 1번 마을에서 각 마을까지 최소 거리
 • PriorityQueue 사용
 • K 이하 거리 개수 세기
• 시간 복잡도: O(E log V)
• 공간 복잡도: O(V + E)
*/

import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        Map<Integer, Integer>[] roadMap = new HashMap[N + 1];
        
        for (int i = 1; i <= N; i++) {
            roadMap[i] = new HashMap<>();
        }
        
        for (int[] r : road) {
            int start = r[0];
            int end = r[1];
            int time = Math.min(roadMap[start].getOrDefault(end, Integer.MAX_VALUE), r[2]);
            
            roadMap[start].put(end, time);
            roadMap[end].put(start, time);
        }
        
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{1, 0}); // {마을 번호, 현재까지 거리}
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int village = current[0];
            int cost = current[1];
            
            if (cost > dist[village]) continue;
            
            for (int next : roadMap[village].keySet()) {
                int nextCost = cost + roadMap[village].get(next);
                
                if (nextCost < dist[next]) {
                    dist[next] = nextCost;
                    pq.offer(new int[]{next, nextCost});
                }
            }
        }
        
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) answer++;
        }
        
        return answer;
    }
}
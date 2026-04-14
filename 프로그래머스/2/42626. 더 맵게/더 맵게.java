/*
• 알고리즘 유형: 우선순위 큐 / 힙
• 핵심 개념
 • 매번 가장 작은 두 값 추출
 • 섞은 값을 다시 넣기
 • 최소 힙 사용
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int s : scoville) {
            pq.offer(s);
        }
        
        int answer = 0;
        
        while (pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            
            int mixed = first + second * 2;
            pq.offer(mixed);
            answer++;
        }
        
        return pq.peek() >= K ? answer : -1;
    }
}
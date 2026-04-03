/*
• 알고리즘: 우선순위 큐 (Priority Queue / Min Heap)
• 핵심 개념
 • 상위 k개 유지
 • 최소 힙으로 최하점 관리
 • 새 점수 추가 후 크기가 k를 넘으면 최솟값 제거
• 시간 복잡도: O(N log K)
• 공간 복잡도: O(K)
*/

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]);
            
            if (pq.size() > k) {
                pq.poll();
            }
            
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}
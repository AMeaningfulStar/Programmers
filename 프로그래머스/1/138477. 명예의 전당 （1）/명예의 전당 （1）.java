import java.util.*;

class Solution {
    public List<Integer> solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]);

            if (pq.size() > k) {
                pq.poll(); // 가장 낮은 점수 제거
            }

            answer.add(pq.peek()); // 현재 명예의 전당 최저 점수
        }

        return answer;
    }
}
/*
• 알고리즘 유형: 그리디 / 우선순위 큐
• 핵심 개념
 • 라운드를 순서대로 진행
 • 일단 병사로 막기
 • 병사가 부족해지면 지금까지 나온 가장 큰 라운드를 무적권 처리
 • 무적권도 없으면 종료
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            pq.offer(enemy[i]);
            
            if(n < 0) {
                if(k > 0) {
                    n += pq.poll();
                    k--;
                } else {
                    return i;
                }
            }
        }
        
        return enemy.length;
    }
}
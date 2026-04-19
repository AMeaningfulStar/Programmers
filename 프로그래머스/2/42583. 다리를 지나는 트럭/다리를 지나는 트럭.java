/*
• 알고리즘 유형: 큐 / 시뮬레이션
• 핵심 개념
 • 다리를 길이 bridge_length짜리 큐로 본다
 • 매 초마다 맨 앞 제거, 뒤에 새 트럭 또는 0 추가
 • 현재 다리 위 총 무게 관리
• 시간 복잡도: O(N)
• 공간 복잡도: O(bridge_length)
*/

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        
        // 처음엔 다리 길이만큼 빈칸
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        int time = 0;
        int idx = 0;
        int currentWeight = 0;
        
        while (idx < truck_weights.length) {
            time++;
            
            // 1. 한 칸 이동: 맨 앞이 나감
            currentWeight -= bridge.poll();
            
            // 2. 다음 트럭이 올라갈 수 있으면 올림
            if (currentWeight + truck_weights[idx] <= weight) {
                bridge.offer(truck_weights[idx]);
                currentWeight += truck_weights[idx];
                idx++;
            } else {
                // 못 올라가면 빈칸
                bridge.offer(0);
            }
        }
        
        // 마지막 트럭이 다리를 완전히 건너는 시간 추가
        return time + bridge_length;
    }
}
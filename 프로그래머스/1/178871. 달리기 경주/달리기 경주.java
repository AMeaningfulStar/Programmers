/*
• 알고리즘 유형: 해시 / 시뮬레이션
• 핵심 개념
 • 이름 → 인덱스 매핑
 • swap 후 map 갱신
• 시간 복잡도: O(N + M)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            map.put(players[i] , i);
        }
        
        for(String call: callings) {
            int idx = map.get(call);
            
            String front = players[idx - 1];
            
            players[idx - 1] = call;
            players[idx] = front;
            
            map.put(call, idx - 1);
            map.put(front, idx);
        }
        
        return players;
    }
}
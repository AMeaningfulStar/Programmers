/*
• 알고리즘: Greedy + 빈도수 카운팅
• 핵심 개념
 • HashMap으로 크기별 개수 세기
 • 개수만 따로 모아 내림차순 정렬
 • 개수가 많은 종류부터 선택
• 시간 복잡도: O(N + M log M)
 • N: 귤 개수
 • M: 서로 다른 귤 크기 개수
• 공간 복잡도: O(M)
*/

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int t: tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> counts = new ArrayList<>(map.values());
        counts.sort(Collections.reverseOrder());
        
        int answer = 0;
        
        for(int count: counts) {
            k -= count;
            answer++;
            
            if(k <= 0) break;
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values());
        
        int answer = 0;
        
        while (k > 0) {
            k -= pq.poll();
            answer++;
        }
        
        return answer;
    }
}
*/
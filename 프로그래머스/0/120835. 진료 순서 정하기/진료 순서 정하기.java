/*
• 알고리즘: 정렬 기반 순위 매기기 (Ranking)
• 핵심 개념
 • 정렬 (Sorting)
 • 값 → 순위 매핑 (HashMap)
 • 원본 위치 유지
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        
        int[] sorted = Arrays.copyOf(emergency, n);
        Arrays.sort(sorted);
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(emergency[i] == sorted[j]) {
                    answer[i] = n - j;
                }
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        
        int[] sorted = Arrays.copyOf(emergency, n);
        Arrays.sort(sorted);
        
        Map<Integer, Integer> rank = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            rank.put(sorted[i], n - i);
        }
        
        for(int i = 0; i < n; i++) {
            answer[i] = rank.get(emergency[i]);
        }
        
        return answer;
    }
}
*/
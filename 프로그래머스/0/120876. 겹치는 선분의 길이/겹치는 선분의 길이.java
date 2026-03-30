/*
• 알고리즘: 좌표 카운팅 (Line Sweep 느낌)
• 핵심 개념
 • 구간 → 점/칸으로 변환
 • 빈도 카운팅
 • 겹침 조건 처리
• 시간 복잡도: O(N × 길이)
• 공간 복잡도: O(N) or O(범위)
*/

import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int[] line: lines) {
            int start = line[0] + 1;
            int end = line[1];
            
            for(int num = start; num <= end; num++) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        
        int answer = 0;
        
        for(int key: map.keySet()) {
            if(map.get(key) > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201]; // -100 ~ 100
        
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                arr[i + 100]++;
            }
        }
        
        int answer = 0;
        for (int count : arr) {
            if (count > 1) answer++;
        }
        
        return answer;
    }
}
*/
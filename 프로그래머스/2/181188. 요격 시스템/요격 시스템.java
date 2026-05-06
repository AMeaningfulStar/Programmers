/*
• 알고리즘 유형: 그리디 / 정렬
• 핵심 개념: 끝점 기준 정렬 후 최소 요격 위치 선택
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(1) 또는 정렬 공간 제외 O(N)
*/

import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (a, b) -> a[1] - b[1]);
        
        int last = 0;
        
        for (int[] target : targets) {
            int s = target[0];
            int e = target[1];
            
            if (last <= s) {
                answer++;
                last = e;
            }
        }
        
        return answer;
    }
}
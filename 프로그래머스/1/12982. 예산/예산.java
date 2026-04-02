/*
• 알고리즘: Greedy + 정렬
• 핵심 개념
 • 최소값부터 선택
 • 누적합
 • 조건 만족 시 계속 진행
• 시간 복잡도: O(N log N) (정렬)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        int sum = 0;
        int answer = 0;
        
        for (int m : d) {
            if (sum + m > budget) break;
            sum += m;
            answer++;
        }
        
        return answer;
    }
}
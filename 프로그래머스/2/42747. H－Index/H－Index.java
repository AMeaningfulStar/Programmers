/*
• 알고리즘 유형: 정렬 + Greedy
• 핵심 개념
 • 정렬 후 뒤에서 개수 세기
 • “남은 개수 vs 값 비교”
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i;
            
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}
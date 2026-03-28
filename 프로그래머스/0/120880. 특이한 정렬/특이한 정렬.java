/*
• 알고리즘: 커스텀 정렬 (Custom Sorting)
• 핵심 개념
 • 절댓값 거리 계산 (Math.abs)
 • 다중 정렬 조건
 • Comparator 사용
 • int[] → Integer[] 변환
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr, (a, b) -> {
            int diffA = Math.abs(a - n);
            int diffB = Math.abs(b - n);
            
            if (diffA == diffB) {
                return b - a;
            }
            
            return diffA - diffB;
        });
        
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
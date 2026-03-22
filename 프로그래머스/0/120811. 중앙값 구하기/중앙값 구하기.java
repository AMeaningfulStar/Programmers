/*
• 알고리즘: 정렬 (Sorting)
• 핵심 개념
 • 배열 정렬
 • 중앙 인덱스 접근
 • median 개념
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(1) (in-place sort)
*/

import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        return array[array.length / 2];
    }
}
/*
알고리즘: 정렬 + 부분 배열 추출
핵심 개념:
• 정렬 알고리즘 (Dual-Pivot QuickSort in Java)
• 작은 값 5개 제거
• 부분 배열 복사
시간 복잡도: O(N log N) (정렬)
공간 복잡도: O(N) (부분 배열 생성)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
				
		return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}
/*
알고리즘: 부분 배열 복사 (Prefix 추출)
핵심 개념:
• Arrays.copyOf(arr, newLength)는 → 앞에서부터 newLength개만 복사
• prefix(접두 부분) 추출 개념
• 배열 슬라이싱을 API로 처리
시간 복잡도: O(n) (복사되는 원소 수만큼)
공간 복잡도: O(n) (새 배열 생성)
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOf(num_list, n);
    }
}
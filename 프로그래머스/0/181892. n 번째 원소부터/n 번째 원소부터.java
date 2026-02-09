/*
알고리즘: 부분 배열 추출
핵심 개념:
• 1-based 인덱스를 0-based로 변환
• Arrays.copyOfRange(start, end)에서 end는 미포함
• 배열 슬라이싱을 통한 결과 생성
시간 복잡도: O(N - (n - 1)) (복사되는 원소 수만큼)
공간 복잡도: O(N - (n - 1)) (결과 배열 크기)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
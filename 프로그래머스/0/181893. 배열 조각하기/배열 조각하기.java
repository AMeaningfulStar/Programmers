/*
알고리즘: 시뮬레이션(쿼리 순차 적용) + 부분 배열 슬라이싱
핵심 개념:
• 쿼리의 인덱스 i의 짝/홀에 따라 자르는 방향이 달라짐
• 짝수 단계: arr[0..q] 유지 → copyOfRange(0, q+1) (끝 미포함 보정)
• 홀수 단계: arr[q..end] 유지 → copyOfRange(q, length)
• 매 단계마다 arr가 “새 배열”로 갱신되는 방식
시간 복잡도: O(쿼리 적용 중 복사된 총 길이 합) (매 단계마다 배열 복사가 발생)
공간 복잡도: O(현재 남은 배열 길이) (매 단계 새로운 배열 생성)
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            int q = query[i];

            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, q + 1);
            } else {
                arr = Arrays.copyOfRange(arr, q, arr.length);
            }
        }
        return arr;
    }
}
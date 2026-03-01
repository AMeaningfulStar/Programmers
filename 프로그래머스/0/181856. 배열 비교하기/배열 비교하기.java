/*
알고리즘: 조건 기반 비교(Comparator 로직)
핵심 개념:
• 1차 기준: 배열 길이
• 2차 기준: 배열 원소 합
• Arrays.stream().sum()으로 누적합 계산
• 다단계 비교 구조 (Lexicographical-style comparison)
시간 복잡도: O(N + M) (N = arr1.length, M = arr2.length)
공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return arr1.length < arr2.length ? -1 : 1;
        }

        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        
        if(sum1 != sum2) return sum1 < sum2 ? -1 : 1;
        
        return 0;
    }
}
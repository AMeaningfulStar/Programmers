/*
• 알고리즘: 완전탐색 + 원형 배열 + 누적합
• 핵심 개념
 • 시작점 고정
 • 길이 확장
 • 원형 인덱스 처리 (%)
 • Set으로 중복 제거
• 시간 복잡도: O(N²)
• 공간 복잡도: O(N²) (서로 다른 합 저장)
*/

import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int n = elements.length;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            
            for (int len = 0; len < n; len++) {
                sum += elements[(i + len) % n];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}
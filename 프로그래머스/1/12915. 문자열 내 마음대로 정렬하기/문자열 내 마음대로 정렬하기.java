/*
• 알고리즘: 정렬 + Comparator
• 핵심 개념
 • 1차 기준: n번째 문자
 • 2차 기준: 문자열 전체
 • compareTo 사용
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b); // 전체 문자열 비교
            }
            return a.charAt(n) - b.charAt(n);
        });
        
        return strings;
    }
}
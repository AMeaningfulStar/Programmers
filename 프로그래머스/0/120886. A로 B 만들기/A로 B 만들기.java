/*
• 알고리즘: 정렬 기반 비교 (Sorting & Comparison)
• 핵심 개념
 • 문자열을 문자 배열로 변환
 • 정렬 후 동일 여부 비교
 • 순서가 아니라 문자 구성만 확인
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        return Arrays.equals(beforeArr, afterArr) ? 1 : 0;
    }
}
/*
알고리즘: 문자열 인덱싱 기반 추출
핵심 개념:
• 문자열 인덱스 범위 [0, n) 사용
• substring(beginIndex, endIndex)의 끝 인덱스 미포함 특성
• 접두사(prefix) 추출 개념
시간 복잡도: O(n) (n = 반환되는 문자열 길이)
공간 복잡도: O(n) (결과 문자열 생성)
*/

class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }
}
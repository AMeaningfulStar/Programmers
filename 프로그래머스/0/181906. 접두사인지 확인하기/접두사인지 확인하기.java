/*
알고리즘: 문자열 접두사 비교
핵심 개념:
• 접두사(prefix)의 정의: 문자열의 시작 부분
• Java 표준 API startsWith 활용
• Boolean 결과를 문제 요구에 맞게 정수(1/0)로 변환
시간 복잡도: O(M) (M = is_prefix.length())
공간 복잡도: O(1) (추가 자료구조 사용 없음)
*/

class Solution {
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
        
        /*
        직접 구현 방식
        if (my_string.length() < is_prefix.length()) return 0;
        return my_string.substring(0, is_prefix.length()).equals(is_prefix) ? 1 : 0;
        */
    }
}
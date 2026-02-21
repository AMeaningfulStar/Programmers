/*
알고리즘: 문자열 분리(Tokenization)
핵심 개념:
• split()은 문자열을 순회하며 구분자를 기준으로 분리
• 내부적으로 정규식 매칭 수행
• 분리된 결과를 새 배열로 반환
시간 복잡도: O(N)
공간 복잡도: O(N) (새 문자열 배열 생성)
*/

class Solution {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
/*
알고리즘: 문자열 인덱싱 기반 추출
핵심 개념:
• 문자열 길이(length())를 이용한 시작 인덱스 계산
• substring(beginIndex)의 특성(끝까지 추출)
• 뒤에서 n글자 = length - n
시간 복잡도: O(n) (n = 반환되는 문자열 길이)
공간 복잡도: O(n) (결과 문자열 생성)
*/

class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length() - n);
        return answer;
    }
}
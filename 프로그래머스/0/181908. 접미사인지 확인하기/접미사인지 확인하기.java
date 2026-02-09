/*
알고리즘: 문자열 접미사 비교
핵심 개념:
• 접미사(suffix)의 정의: 문자열의 끝부분
• 길이 비교로 불가능한 경우 사전 제거
• substring(length - suffixLength)로 접미사 추출
• 문자열 비교는 equals 사용
시간 복잡도: O(M) (M = is_suffix.length())
공간 복잡도: O(M) (substring으로 생성된 임시 문자열)
*/
class Solution {
    public int solution(String my_string, String is_suffix) {
        if(my_string.length() < is_suffix.length()) {
            return 0;
        }
        
        return my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix) ? 1 : 0;
        
        /*
        더 간단한 풀이
        return my_string.endsWith(is_suffix) ? 1 : 0;
        */
    }
}
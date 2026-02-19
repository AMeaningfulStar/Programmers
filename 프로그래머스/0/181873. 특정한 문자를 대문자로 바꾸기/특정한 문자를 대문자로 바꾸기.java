/*
알고리즘: 문자열 선형 탐색 + 문자 치환
핵심 개념:
• String.replace()는 내부적으로 문자열을 순회
• 일치하는 부분을 새 문자열로 치환
• 문자열은 immutable → 새로운 문자열 반환
시간 복잡도: O(N)
공간 복잡도: O(N)
*/

class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
        
        /*
        더 안전한 풀이
        return my_string.replace(alp.charAt(0), Character.toUpperCase(alp.charAt(0)));
        */
    }
}
/*
알고리즘: 문자열 순회 + 문자 치환
핵심 개념:
• replace()는 문자열을 순회하며 일치하는 부분을 새 문자열로 교체
• 문자열은 immutable → 새 문자열 생성
• 치환 후 길이가 증가할 수 있음 (m → rn)
시간 복잡도: O(N)
공간 복잡도: O(N)
*/

class Solution {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
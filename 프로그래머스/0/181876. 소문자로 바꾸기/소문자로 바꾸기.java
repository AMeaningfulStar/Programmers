/*
알고리즘: 문자열 문자 매핑 (Character Transformation)
핵심 개념:
• toLowerCase()는 문자열을 순회하며 각 문자를 소문자로 변환
• 문자열은 immutable → 새 문자열 생성
• 내부적으로 Unicode 기반 문자 변환 수행
시간 복잡도: O(N)
공간 복잡도: O(N) (새 문자열 생성)
*/

class Solution {
    public String solution(String myString) {
        return myString.toLowerCase();
    }
}
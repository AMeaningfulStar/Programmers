/*
알고리즘: 문자열 변환 (Character Mapping)
핵심 개념:
• toUpperCase()는 문자열의 각 문자를 순회하며 대문자로 변환
• 문자열은 immutable → 새 문자열 생성
• 내부적으로는 각 문자에 대해 ASCII/Unicode 매핑 수행
시간 복잡도: O(N)
공간 복잡도: O(N) (새 문자열 생성)
*/

class Solution {
    public String solution(String myString) {
        return myString.toUpperCase();
    }
}
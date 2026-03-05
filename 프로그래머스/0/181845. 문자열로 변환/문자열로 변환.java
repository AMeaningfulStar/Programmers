/*
알고리즘: 타입 변환(Type Conversion)
핵심 개념:
• primitive 타입(int)을 문자열(String)로 변환
• Java의 문자열 결합 규칙 활용
시간 복잡도: O(d) (d = 숫자의 자릿수)
공간 복잡도: O(d)
*/

class Solution {
    public String solution(int n) {
        return n + "";
        /*
        다른 풀이
        1.
        return String.valueOf(n);
        
        2.
        return Integer.toString(n);
        */
    }
}
/*
알고리즘: 형변환(타입 캐스팅)
핵심 개념:
• double → int 형변환
• 소수점 이하 절삭(truncation)
• Java 기본 타입 캐스팅 동작 이해
시간 복잡도: O(1)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(double flo) {
        return (int) flo;
        
        /*
        다른 풀이
        return (int) Math.floor(flo);
        */
    }
}
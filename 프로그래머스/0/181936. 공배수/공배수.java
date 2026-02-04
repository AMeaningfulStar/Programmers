/*
알고리즘: 조건 판단
핵심 개념: % 나머지 연산, && 논리 AND, 조건식 간결화
시간 복잡도: O(1)
공간 복잡도: O(1)
*/
class Solution {
    public int solution(int number, int n, int m) {
        return number % n != 0 ? 0 : number % m != 0 ? 0 : 1;
        /*
        더 좋은 풀이 코드
        return (number % n == 0 && number % m == 0) ? 1 : 0;
        */
    }
}
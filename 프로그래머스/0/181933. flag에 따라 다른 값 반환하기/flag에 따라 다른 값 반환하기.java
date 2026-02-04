/*
알고리즘: 없음
핵심 개념:boolean 조건 분기, 삼항 연산자 사용
시간 복잡도: O(1)
공간 복잡도: O(1)
*/
class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? (a + b) : (a - b);
    }
}
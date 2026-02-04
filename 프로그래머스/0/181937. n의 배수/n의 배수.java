/*
알고리즘: 조건 판단
자료구조: 없음
시간 복잡도: O(1)
공간 복잡도: O(1)
*/
class Solution {
    public int solution(int num, int n) {
        return num % n != 0 ? 0 : 1;
    }
}
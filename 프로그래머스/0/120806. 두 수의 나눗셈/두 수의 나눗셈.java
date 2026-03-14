/*
알고리즘: 산술 연산 (Arithmetic Calculation)
핵심 개념:
• 정수 → 실수 캐스팅
• 실수 나눗셈
• 소수점 버림 (type casting)
시간 복잡도: O(1)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(int num1, int num2) {
        return (int) ((double) num1 / num2 * 1000);
    }
}
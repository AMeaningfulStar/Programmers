/*
• 알고리즘: 산술 연산 (Arithmetic Calculation)
• 핵심 개념
 • 몫 연산 (/) → 개수 계산
 • 나머지 연산 (%) → 잔돈 계산
 • 정수 나눗셈
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(int money) {
        return new int[]{money / 5500, money % 5500};
    }
}
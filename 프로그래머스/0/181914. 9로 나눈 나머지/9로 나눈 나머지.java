/*
알고리즘: 선형 순회
핵심 개념:
• 문자열을 숫자 배열처럼 순회
• char → 숫자 변환 (char - '0')
• 누적 합 계산 후 모듈러 연산
시간 복잡도: O(N) (N = number.length())
공간 복잡도: O(1) (추가 자료구조 없이 정수 변수만 사용)
*/

class Solution {
    public int solution(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }

        return sum % 9;
    }
}
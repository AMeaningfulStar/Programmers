/*
알고리즘: 논리 연산 평가 (Boolean Expression Evaluation)
핵심 개념:
• 논리합(OR, ||)
• 논리곱(AND, &&)
• 괄호를 이용한 연산 우선순위 제어
• 불리언 식을 그대로 코드로 표현하는 방식
시간 복잡도: O(1) (고정된 개수의 논리 연산)
공간 복잡도: O(1) (추가 메모리 사용 없음)
*/

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 || x2) && (x3 || x4);
        return answer;
    }
}
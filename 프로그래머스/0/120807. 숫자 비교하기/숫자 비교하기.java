/*
알고리즘: 조건 비교 (Conditional Comparison)
핵심 개념:
• 두 정수의 동일 여부 비교
• 삼항 연산자를 이용한 결과 반환
시간 복잡도: O(1)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int num1, int num2) {
        if(num1 == num2) {
            return 1;
        }
        return -1;
    }
}
*/
/*
• 알고리즘: 산술 연산 (Arithmetic Calculation)
• 핵심 개념
 • 정수 나눗셈을 이용한 서비스 개수 계산
 • 할인 적용 후 금액 계산
 • 기본 산술 연산 (+, *, /)
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n, int k) {
        int answer = (n * 12000) + (k - (n / 10)) * 2000;
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        int drink = k - service;

        return n * 12000 + drink * 2000;
    }
}
*/
/*
• 알고리즘: 산술 연산 (Arithmetic Calculation)
• 핵심 개념
 • 정수 나눗셈을 이용한 몫 계산
 • 나머지를 이용한 추가 필요 여부 판단
 • 올림 처리 로직 ((n + divisor - 1) / divisor)
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int answer = n / 7;
        return n % 7 > 0 ? answer + 1 : answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}
*/
/*
• 알고리즘: 반복문 + 누적 곱 (Factorial Iteration)
• 핵심 개념
 • 누적 곱 (factorial *= i)
 • 종료 조건 (> n)
 • 경계 처리 (-1)
• 시간 복잡도: O(k) (k는 정답 값)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int answer = 1;
        int total = 1;
        
        while(true) {
            if(n < total * answer) {
                break;
            }
            
            total *= answer;
            answer++;
        }
        
        return answer - 1;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int n) {
        int i = 1;
        int factorial = 1;
        
        while(factorial <= n) {
            i++;
            factorial *= i;
        }
        
        return i - 1;
    }
}
*/
/*
• 알고리즘: 수학 연산 + 반복 (Arithmetic & Iteration)
• 핵심 개념
 • 자릿수 분해 (% 10, / 10)
 • 반복을 통한 누적 합 계산
 • 또는 문자열 순회 방식
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        
        for(int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }
}
*/
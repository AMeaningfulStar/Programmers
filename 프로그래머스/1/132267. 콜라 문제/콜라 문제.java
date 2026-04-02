/*
• 알고리즘: 시뮬레이션 (Simulation)
• 핵심 개념
 • 몫 계산 (n / a)
 • 나머지 계산 (n % a)
 • 상태 갱신
 • 반복 종료 조건
• 시간 복잡도: O(log N) 수준의 반복
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            answer += (n / a) * b;
            
            n = ((n / a) * b) + (n % a);
        } 
        
        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int exchanged = (n / a) * b;
            answer += exchanged;
            n = exchanged + (n % a);
        }
        
        return answer;
    }
}
*/
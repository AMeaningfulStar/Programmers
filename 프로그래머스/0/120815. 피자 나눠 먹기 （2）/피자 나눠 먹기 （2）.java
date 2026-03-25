/*
• 알고리즘: 최대공약수(GCD) / 최소공배수(LCM)
• 핵심 개념
 • GCD (유클리드 호제법)
 • LCM = (a × b) / GCD
 • 분배 문제 → 공배수 문제
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true) {
            answer += 1;
            
            if((6 * answer) % n == 0) break;
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int n) {
        return n / gcd(n, 6);
    }
    
    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
*/
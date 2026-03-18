/*
• 알고리즘: 완전 탐색 + 수학 최적화 (Brute Force & Math Optimization)
• 핵심 개념
 • 약수 판별 (n % i == 0)
 • 약수 쌍 개념 (i, n/i)
 • √n 범위까지만 탐색
• 시간 복잡도: O(√N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int num = 1; num <= n; num++) {
            if(n % num == 0) answer += 1;
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                answer++; // i
                if(i != n / i) answer++; // 짝 약수
            }
        }
        
        return answer;
    }
}
*/
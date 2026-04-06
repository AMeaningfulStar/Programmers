/*
• 알고리즘 유형: 수학 + 에라토스테네스의 체
• 핵심 개념
 • 소수의 배수 제거
 • i*i부터 시작
• 시간 복잡도: O(N log log N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        
        // 초기값: 전부 소수라고 가정
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        // 체
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) answer++;
        }
        
        return answer;
    }
}
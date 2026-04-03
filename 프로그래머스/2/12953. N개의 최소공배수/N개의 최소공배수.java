/*
• 알고리즘 유형: 수학 / 유클리드 호제법
• 핵심 개념
 • 최대공약수(GCD)
 • 최소공배수(LCM)
 • 여러 수의 최소공배수는 누적 계산
• 시간 복잡도: O(N log M)
 • M은 숫자 크기
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            answer = answer * arr[i] / gcd(answer, arr[i]);
        }
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        if(b == 0) return a;
        
        return gcd(b, a % b);
    }
}
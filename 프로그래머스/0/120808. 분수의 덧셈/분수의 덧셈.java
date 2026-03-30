/*
• 알고리즘: 수학 + 유클리드 호제법
• 핵심 개념
 • 분수 통분
 • 분자 계산
 • 최대공약수(GCD)
 • 기약분수 변환
• 시간 복잡도: O(log N) (gcd)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int gcd = gcd(numer, denom);
        
        return new int[]{numer / gcd, denom / gcd};
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
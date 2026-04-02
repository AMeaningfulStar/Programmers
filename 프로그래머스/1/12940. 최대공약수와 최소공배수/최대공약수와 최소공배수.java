/*
• 알고리즘: 유클리드 호제법 (Euclidean Algorithm)
• 핵심 개념
 • 최대공약수(GCD) 계산
 • 최소공배수(LCM) 공식 활용
 • lcm = n * m / gcd
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;
        
        return new int[]{gcd, lcm};
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
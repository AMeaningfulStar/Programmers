/*
• 알고리즘: 최대공약수 + 소인수 판별
• 핵심 개념
 • 기약분수 만들기 (b / gcd(a, b))
 • 분모의 소인수에서 2와 5 제거
 • 2와 5 이외의 소인수 존재 여부 판별
 • 유클리드 호제법
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int a, int b) {
        int newB = b / gcd(a, b); 

        while (newB != 1) {
            if (newB % 2 == 0) newB /= 2;
            else if (newB % 5 == 0) newB /= 5;
            else return 2;
        }
        return 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }  
}

/*
다른 풀이
class Solution {
    public int solution(int a, int b) {
        int denom = b / gcd(a, b);

        while (denom % 2 == 0) denom /= 2;
        while (denom % 5 == 0) denom /= 5;

        return denom == 1 ? 1 : 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
*/
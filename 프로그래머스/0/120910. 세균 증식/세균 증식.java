/*
• 알고리즘: 산술 연산 (Arithmetic Calculation)
• 핵심 개념
 • 지수 증가 (2^t)
 • 반복적인 배수 증가 (2배씩 증가)
 • 비트 연산을 통한 최적화 (<<)
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n, int t) {
        return n * (int) Math.pow(2, t);
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int n, int t) {
        return n << t;
    }
}

2.
class Solution {
    public int solution(int n, int t) {
        for(int i = 0; i < t; i++) {
            n *= 2;
        }
        return n;
    }
}
*/
/*
• 알고리즘 유형: 수학 / 최대공약수
• 핵심 개념:
 • 전체 칸 = w × h
 • 잘리는 칸 = w + h - gcd(w, h)
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public long solution(int w, int h) {
        return (long) w * h - (w + h - gcd(w, h));
    }
    
    private long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
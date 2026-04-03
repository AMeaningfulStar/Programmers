/*
• 알고리즘: 브루트포스 + 비트카운트
• 핵심 개념
 • 이진수 변환
 • 1의 개수 유지
 • 다음 수 탐색
• 시간 복잡도: 평균 O(1) ~ O(log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        
        while (true) {
            n++;
            if (Integer.bitCount(n) == count) {
                return n;
            }
        }
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int n) {
        int c = n;
        int c0 = 0, c1 = 0;
        
        while ((c & 1) == 0 && c != 0) {
            c0++;
            c >>= 1;
        }
        
        while ((c & 1) == 1) {
            c1++;
            c >>= 1;
        }
        
        int p = c0 + c1;
        
        n |= (1 << p);
        n &= ~((1 << p) - 1);
        n |= (1 << (c1 - 1)) - 1;
        
        return n;
    }
}
*/
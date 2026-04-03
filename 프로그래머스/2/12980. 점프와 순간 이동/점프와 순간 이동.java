/*
• 알고리즘: 비트 연산 (Greedy 성질)
• 핵심 개념
 • 2로 나누기 (순간이동)
 • 홀수일 때만 비용 발생
 • 이진수의 1 개수
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        while(n > 0) {
            ans += n % 2;
            n /= 2;
        }
        
        return ans;
    }
}

/*
다른 풀이
1. 비트를 이용한 풀이
public int solution(int n) {
    return Integer.bitCount(n);
}
*/
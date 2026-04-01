/*
• 알고리즘: 정렬 / 카운팅
• 핵심 개념
 • 자릿수 분해
 • 내림차순 정렬
 • 숫자 재구성
• 시간 복잡도:
 • 현재 코드: O(N log N)
 • 최적화: O(N)
• 공간 복잡도: O(N) 또는 O(1)
*/

import java.util.*;

class Solution {
    public long solution(long n) {
        List<Integer> list = new ArrayList<>();
        long answer = 0;

        while (n != 0) {
            list.add((int)(n % 10));
            n /= 10;
        }

        list.sort(Collections.reverseOrder());

        for (int num : list) {
            answer = answer * 10 + num;
        }

        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(new String(arr));
        
        return Long.parseLong(sb.reverse().toString());
    }
}

2.
class Solution {
    public long solution(long n) {
        int[] count = new int[10];
        
        while (n > 0) {
            count[(int)(n % 10)]++;
            n /= 10;
        }
        
        long answer = 0;
        
        for (int i = 9; i >= 0; i--) {
            while (count[i]-- > 0) {
                answer = answer * 10 + i;
            }
        }
        
        return answer;
    }
}
*/
/*
• 알고리즘: 문자열 파싱 + 최소/최대 탐색
• 핵심 개념
 • 문자열 → 숫자 변환
 • 한 번 순회로 min/max 동시 계산
• 시간 복잡도: O(n)
• 공간 복잡도: O(n) (split)
*/

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String num: numbers) {
            int value = Integer.parseInt(num);
            max = Math.max(max, value);
            min = Math.min(min, value);
        }
        
        return min + " " + max;
    }
}

/*
다른 풀이
1.
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] arr = Arrays.stream(s.split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        
        return Arrays.stream(arr).min().getAsInt() + " " +
               Arrays.stream(arr).max().getAsInt();
    }
}
*/
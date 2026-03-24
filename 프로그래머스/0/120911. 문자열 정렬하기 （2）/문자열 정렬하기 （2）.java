/*
• 알고리즘: 문자열 정렬 (String Sorting)
• 핵심 개념
 • 소문자 변환 (toLowerCase)
 • 배열 변환 (toCharArray)
 • 정렬 (Arrays.sort)
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] answer = my_string.toCharArray();
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Character.toLowerCase(answer[i]);
        }
        
        Arrays.sort(answer);
        
        return new String(answer);
    }
}

/*
다른 풀이
1.
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

2.
class Solution {
    public String solution(String my_string) {
        return my_string.toLowerCase()
                        .chars()
                        .sorted()
                        .collect(StringBuilder::new,
                                 StringBuilder::appendCodePoint,
                                 StringBuilder::append)
                        .toString();
    }
}
*/
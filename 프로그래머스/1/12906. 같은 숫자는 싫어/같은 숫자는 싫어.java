/*
• 알고리즘: 배열 순회
• 핵심 개념
 • 이전 값(prev) 기억
 • 연속 중복 제거
• 시간 복잡도: O(n)
• 공간 복잡도: O(n)
*/

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        if (arr.length == 0) return new int[0];
        
        List<Integer> answer = new ArrayList<>();
        
        answer.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] != arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

/*
다른 풀이
1.
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        int prev = -1; // 또는 Integer.MIN_VALUE
        
        for(int num : arr) {
            if(num != prev) {
                answer.add(num);
                prev = num;
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
*/
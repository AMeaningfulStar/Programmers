/*
• 알고리즘: 배열 순회 + 필터링 (Array Traversal & Filtering)
• 핵심 개념
 • 배열 전체 순회
 • 조건 필터링 (num % n == 0)
 • 동적 리스트 저장 후 배열 변환
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        
        for(int num: numlist) {
            if(num % n == 0) list.add(num);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
                     .filter(num -> num % n == 0)
                     .toArray();
    }
}
*/
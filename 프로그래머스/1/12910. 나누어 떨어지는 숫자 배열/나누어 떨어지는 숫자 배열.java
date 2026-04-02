/*
• 알고리즘: 필터링 + 정렬
• 핵심 개념
 • 조건 필터
 • 리스트 → 배열 변환
 • 정렬
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) list.add(num);
        }
        
        if (list.isEmpty()) return new int[]{-1};
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) list.add(num);
        }
        
        if (list.isEmpty()) return new int[]{-1};
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
*/
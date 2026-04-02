/*
• 알고리즘: 배열 순회 / 필터링
• 핵심 개념
 • 최소값 탐색
 • 조건 필터
 • 리스트 변환
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        int min = Integer.MAX_VALUE;
        
        for(int num: arr) {
            min = Math.min(min, num);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int num: arr) {
            if(num != min) list.add(num);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}

/*
다른 풀이
1.
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int min = Arrays.stream(arr).min().getAsInt();
        
        return Arrays.stream(arr)
                     .filter(num -> num != min)
                     .toArray();
    }
}
*/
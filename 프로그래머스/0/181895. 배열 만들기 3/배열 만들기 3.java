/*
알고리즘: 구간 순회(Interval Expansion) + 결과 누적
핵심 개념:
• 각 구간 [start, end]를 인덱스로 순회하며 원소 추출
• 여러 구간의 결과를 순서대로 이어붙이기(Concatenation)
• 가변 길이 수집을 위해 List<Integer> 사용 후 int[]로 변환
시간 복잡도: O(L) (L = (b-a+1) + (d-c+1) = 뽑아낸 총 원소 수)
공간 복잡도: O(L) (결과 저장 공간)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] interval: intervals) {
            for(int idx = interval[0]; idx <= interval[1]; idx++) {
                list.add(arr[idx]);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int idx = 0; idx < list.size(); idx++) {
            answer[idx] = list.get(idx);
        }
        return answer;
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a = intervals[0][0], b = intervals[0][1];
        int c = intervals[1][0], d = intervals[1][1];

        int len = (b - a + 1) + (d - c + 1);
        int[] answer = new int[len];

        int p = 0;
        for (int i = a; i <= b; i++) answer[p++] = arr[i];
        for (int i = c; i <= d; i++) answer[p++] = arr[i];

        return answer;
    }
}

*/
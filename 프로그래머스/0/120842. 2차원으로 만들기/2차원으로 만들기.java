/*
• 알고리즘: 배열 변환 (Array Transformation)
• 핵심 개념
 • 1차원 배열을 일정 크기씩 분할
 • 구간 복사 (Arrays.copyOfRange)
 • 2차원 배열 행 단위 구성
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int idx = 0;
        
        for(int i = n; i <= num_list.length; i += n) {
            answer[idx] = Arrays.copyOfRange(num_list, (i - n), i);
            idx++;
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        
        return answer;
    }
}
*/
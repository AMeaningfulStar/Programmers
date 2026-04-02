/*
• 알고리즘: 배열 슬라이싱 + 정렬
• 핵심 개념
 • 부분 배열 추출 (Arrays.copyOfRange)
 • 정렬 (Arrays.sort)
 • 1-based → 0-based 인덱스 변환
• 시간 복잡도: O(M × N log N)
 • M = commands 개수
 • 각 명령마다 부분 배열 정렬
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            int[] arr = Arrays.copyOfRange(array, i - 1, j);
            
            Arrays.sort(arr);
            
            answer[idx] = arr[k - 1];
        }
        
        return answer;
    }
}
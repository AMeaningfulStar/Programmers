/*
• 알고리즘 유형: 정렬 / 구현
• 핵심 개념
 • col 기준 오름차순 정렬
 • 같으면 첫 컬럼 기준 내림차순
 • 정렬 후 행 번호 기준으로 % i 합 계산
 • XOR 누적
• 시간 복잡도: O(N log N + N*M)
• 공간 복잡도: O(1) 추가 공간
*/

import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, (a, b) -> {
            if(a[col - 1] == b[col - 1]) {
                return b[0] - a[0];
            }
            return a[col - 1] - b[col - 1];
        });
        
        int answer = 0;
        
        for(int i = row_begin; i <= row_end; i++) {
            int sum = 0;
            
            for(int value : data[i - 1]) {
                sum += value % i;
            }
            
            answer ^= sum;
        }
        
        return answer;
    }
}
/*
• 알고리즘 유형: 그리디 + 정렬
• 핵심 개념
 • 큰 값부터 묶기
 • 그룹의 최소값이 중요
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        } 
        
        return answer;
    }
}
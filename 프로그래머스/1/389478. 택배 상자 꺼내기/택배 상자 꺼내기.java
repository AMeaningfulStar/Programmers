/*
• 알고리즘 유형: 구현 / 시뮬레이션 / 2차원 배열
• 핵심 개념
 • 지그재그 배치
 • num의 열 찾기
 • 같은 열의 위쪽 상자 개수 세기
• 시간 복잡도: O((n / w) × w) ≈ O(n)
• 공간 복잡도: O(n)
*/

import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        int[][] box_list = new int[(n + w - 1) / w][w];
        int idx = 0;
        
        for(int i = 0; i < box_list.length; i++) {
            for(int j = 0; j < w; j++) {
                int result = i % 2 == 0 ? (i * w) + j + 1 : ((i + 1) * w) - j;
                if (result <= n) {
                    box_list[i][j] = result;
                    if (result == num) idx = j;
                } else {
                    box_list[i][j] = 0;
                }
            }
        }
        
        int answer = 0;
        
        for(int i = 0; i < box_list.length; i++) {
            if(box_list[i][idx] >= num) answer++;
        }
        
        return answer;
    }
}
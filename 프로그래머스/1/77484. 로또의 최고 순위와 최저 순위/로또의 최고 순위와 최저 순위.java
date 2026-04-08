/*
• 알고리즘 유형: 구현 / 배열 / 조건 처리
• 핵심 개념
 • 맞은 개수 계산
 • 0 개수 계산
 • 최대 / 최소 분리
 • 순위 변환 함수
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        boolean[] numbers = new boolean[46];
        int zero = 0;
        int ok = 0;
        
        for (int num : win_nums) {
            numbers[num] = true;
        }
        
        for (int num : lottos) {
            if (num == 0) {
                zero++;
            } else if (numbers[num]) {
                ok++;
            }
        }
        
        int max = ok + zero;
        int min = ok;
        
        return new int[]{getRank(max), getRank(min)};
    }
    
    private int getRank(int match) {
        return match >= 2 ? 7 - match : 6;
    }
}
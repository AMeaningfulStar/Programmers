/*
• 알고리즘 유형: 구현 / 시뮬레이션 / 큐 또는 배열
• 핵심 개념
 • 현재 살아 있는 서버 수 관리
 • 시간별 만료 처리
 • 필요한 서버 수 = players[i] / m
 • 부족한 만큼만 증설
• 시간 복잡도: O(24)
• 공간 복잡도: O(24 + k) 또는 O(증설 횟수)
*/

import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        Queue<int[]> queue = new LinkedList<>();
        int active = 0;
        int answer = 0;
        
        for(int i = 0; i < 24; i++) {
            while(!queue.isEmpty() && queue.peek()[0] == i) {
                active -= queue.poll()[1];
            }
            
            int need = players[i] / m;
            
            if(active < need) {
                int add = need - active;
                answer += add;
                active += add;
                queue.offer(new int[]{i + k, add});
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
class Solution {

    public int solution(int[] players, int m, int k) {

        int[] expire = new int[24 + k + 1];

        int active = 0;

        int answer = 0;

        

        for (int i = 0; i < 24; i++) {

            active -= expire[i];

            

            int need = players[i] / m;

            

            if (active < need) {

                int add = need - active;

                answer += add;

                active += add;

                expire[i + k] += add;

            }

        }

        

        return answer;

    }

}
*/
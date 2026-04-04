/*
• 알고리즘 유형: 구현 / 그리디 / 큐 느낌의 순차 처리
• 핵심 개념 목록
 • 각 기능의 완료일까지 계산
 • 앞 기능보다 빨리 끝나도 먼저 배포 불가
 • 앞 기능 기준으로 묶어서 배포
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        
        int n = progresses.length;
        int[] days = new int[n];
        
        // 1. 각 기능이 완료되는 날짜 계산
        for (int i = 0; i < n; i++) {
            int remain = 100 - progresses[i];
            days[i] = (remain + speeds[i] - 1) / speeds[i]; // 올림 처리
        }
        
        // 2. 앞에서부터 묶어서 배포 개수 계산
        int current = days[0];
        int count = 1;
        
        for (int i = 1; i < n; i++) {
            if (days[i] <= current) {
                count++;
            } else {
                result.add(count);
                current = days[i];
                count = 1;
            }
        }
        
        result.add(count);
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}
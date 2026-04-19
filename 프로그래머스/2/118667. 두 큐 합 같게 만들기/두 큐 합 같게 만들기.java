/*
• 알고리즘 유형: 투포인터 / 시뮬레이션 / 큐
• 핵심 개념
 • 합이 큰 쪽에서 하나 빼고 작은 쪽으로 넘김
 • 배열 2개를 이어붙여 포인터로 관리
 • 무한 루프 방지용 최대 연산 횟수 필요
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum1 = 0;
        long sum2 = 0;
        
        for (int num : queue1) sum1 += num;
        for (int num : queue2) sum2 += num;
        
        long total = sum1 + sum2;
        if (total % 2 != 0) return -1;
        
        long target = total / 2;
        
        int n = queue1.length;
        int[] arr = new int[n * 2];
        for (int i = 0; i < n; i++) arr[i] = queue1[i];
        for (int i = 0; i < n; i++) arr[n + i] = queue2[i];
        
        int left = 0;
        int right = n;
        int answer = 0;
        int maxOps = n * 4;
        
        while(answer <= maxOps) {
            if(sum1 == target) return answer;
            
            if(sum1 > target) {
                sum1 -= arr[left % (2 * n)];
                left++;
            } else {
                sum1 += arr[right % (2 * n)];
                right++;
            }
            
            answer++;
        }
        
        return -1;
    }
}
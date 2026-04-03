/*
• 알고리즘: Greedy + 투포인터
• 핵심 개념
 • 정렬
 • 가장 큰 값 먼저 처리
 • 가장 작은 값과 짝 맞추기
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        int answer = 0;
        
        while(left <= right) {
            if(people[left] + people[right] <= limit) {
                left++;
            }
            
            right--;
            answer++;
        }
        
        return answer;
    }
}
/*
• 알고리즘: 완전탐색 (Brute Force)
• 핵심 개념
 • 절댓값 거리 계산 (Math.abs)
 • 최소값 갱신 (min tracking)
 • tie-break 조건 처리
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for(int num : array) {
            int diff = Math.abs(num - n);
            
            if(diff < minDiff) {
                minDiff = diff;
                answer = num;
            } else if(diff == minDiff && num < answer) {
                answer = num;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer = array[0];
        int minDiff = Math.abs(array[0] - n);
        
        for(int num : array) {
            int diff = Math.abs(num - n);
            
            if(diff < minDiff) {
                minDiff = diff;
                answer = num;
            }
        }
        
        return answer;
    }
}
*/
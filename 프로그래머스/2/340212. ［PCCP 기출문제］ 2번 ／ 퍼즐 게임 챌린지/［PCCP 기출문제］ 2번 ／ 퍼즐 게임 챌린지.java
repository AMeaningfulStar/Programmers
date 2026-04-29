/*
• 알고리즘 유형: 이분 탐색
• 핵심 개념: level이 커질수록 총 시간이 줄어드는 단조성
• 시간 복잡도: O(N log maxDiff)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int left = 1;
        int right = 0;
        
        for (int diff : diffs) {
            right = Math.max(right, diff);
        }
        
        int answer = right;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (canSolve(diffs, times, limit, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
    
    private boolean canSolve(int[] diffs, int[] times, long limit, int level) {
        long total = 0;
        
        for (int i = 0; i < diffs.length; i++) {
            int diff = diffs[i];
            int timeCur = times[i];
            int timePrev = i == 0 ? 0 : times[i - 1];
            
            if (diff <= level) {
                total += timeCur;
            } else {
                int failCount = diff - level;
                total += (long) failCount * (timeCur + timePrev) + timeCur;
            }
            
            if(total > limit) return false;
        }
        
        return true;
    }
}
/*
• 알고리즘: Greedy
• 핵심 개념
 • 각 원소 정렬 (max/min)
 • 기준 통일
 • 최대값 갱신
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        
        for(int[] size: sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            
            w = Math.max(w , max);
            h = Math.max(h, min);
        }
        
        return w * h;
    }
}
/*
• 알고리즘: 기하학 + 최소/최대 탐색
• 핵심 개념
 • 좌표 비교
 • 같은 x / 같은 y 판단
 • 절댓값 거리 계산
 • (대안) min/max로 범위 계산
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            maxX = Math.max(maxX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxY = Math.max(maxY, dot[1]);
        }
        
        return (maxX - minX) * (maxY - minY);
    }
}
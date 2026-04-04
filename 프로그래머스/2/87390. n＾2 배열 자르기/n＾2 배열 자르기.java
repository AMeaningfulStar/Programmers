/*
• 알고리즘 유형: 수학 / 인덱스 매핑
• 핵심 개념
 • 1차원 인덱스 → 2차원 좌표 변환
 • 각 좌표 값 = max(row, col) + 1
 • 필요한 구간만 직접 계산
• 시간 복잡도: O(right - left + 1)
• 공간 복잡도: O(right - left + 1)
*/

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        
        for (long idx = left; idx <= right; idx++) {
            long row = idx / n;
            long col = idx % n;
            
            answer[(int)(idx - left)] = (int)Math.max(row, col) + 1;
        }
        
        return answer;
    }
}
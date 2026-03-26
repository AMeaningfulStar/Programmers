/*
• 알고리즘: 수학적 사고 (Mathematical Insight)
• 핵심 개념
 • 조각 수 증가 패턴 (+1씩 증가)
 • 전체 조각 수 = M × N
 • 최소 연산 횟수 = (조각 수 - 1)
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int M, int N) {
        return M * N - 1;
    }
}
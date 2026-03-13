/*
알고리즘: 2차원 배열 선형 순회 + 조건 필터링
핵심 개념:
• 2중 반복문으로 모든 좌표 순회
• 좌표 합 i + j를 기준으로 조건 판별
• 조건을 만족하는 값만 누적합 계산
시간 복잡도: O(R × C) (R = 행 개수, C = 열 개수)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols && j <= k - i; j++) {
                answer += board[i][j];
            }
        }

        return answer;
    }
}
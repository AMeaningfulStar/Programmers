/*
알고리즘: 배열 확장 (Matrix Padding)
핵심 개념:
• 행과 열의 최대 크기 계산
• 새로운 정사각형 배열 생성
• 기존 배열 영역만 복사
• 나머지는 기본값(0) 유지
시간 복잡도: O(n × m)
공간 복잡도: O(max(n, m)²)
*/

class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int size = Math.max(rows, cols);

        int[][] answer = new int[size][size];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
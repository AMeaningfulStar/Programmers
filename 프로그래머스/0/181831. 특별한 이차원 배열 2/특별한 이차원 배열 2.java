/*
알고리즘: 대칭 행렬 검사 (Matrix Symmetry Check)
핵심 개념:
• (i, j) 와 (j, i) 비교
• 대각선 기준 대칭 검사
• 불일치 발견 시 즉시 종료
시간 복잡도: O(n² / 2)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }

        return 1;
    }
}
/*
알고리즘: 대각선 인덱스 직접 접근
핵심 개념:
• 2차원 배열 생성
• (i,i) 위치는 대각선
• 대각선 원소만 값 설정
시간 복잡도: O(n)
공간 복잡도: O(n²)
*/

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for(int idx = 0; idx < n; idx++) {
            answer[idx][idx] = 1;
        }
        
        return answer;
    }
}
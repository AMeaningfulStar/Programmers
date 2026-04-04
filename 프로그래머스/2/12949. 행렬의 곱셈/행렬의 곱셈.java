/*
• 알고리즘 유형: 구현 / 행렬 연산
• 핵심 개념
 • 행렬 곱 정의
 • (i, j) 위치는 내적 계산
 • k를 통해 누적 합
• 시간 복잡도: O(n × m × p)
• 공간 복잡도: O(n × p)
*/

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                int sum = 0;
                
                for(int k = 0; k < arr2.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}
/*
• 알고리즘: 수학 계산 (Mathematical Calculation)
• 핵심 개념
 • 연속된 수열의 합 공식 활용
 • 시작값 계산
 • 등차수열 생성
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int start = total / num - (num - 1) / 2;
        
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        
        return answer;
    }
}
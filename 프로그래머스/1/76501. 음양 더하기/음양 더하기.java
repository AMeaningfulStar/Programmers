/*
• 알고리즘: 배열 순회
• 핵심 개념
 • 조건에 따른 값 변경
 • 누적 합
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }
        
        return answer;
    }
}
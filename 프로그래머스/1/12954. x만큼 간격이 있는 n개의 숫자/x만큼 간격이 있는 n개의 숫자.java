/*
• 알고리즘: 등차수열 생성
• 핵심 개념
 • 반복문
 • 패턴 생성
 • 오버플로우 방지 (long)
• 시간 복잡도: O(n)
• 공간 복잡도: O(n)
*/

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long current = x;
        
        for (int i = 0; i < n; i++) {
            answer[i] = current;
            current += x;
        }
        
        return answer;
    }
}
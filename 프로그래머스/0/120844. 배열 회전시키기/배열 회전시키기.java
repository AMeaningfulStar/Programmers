/*
• 알고리즘: 배열 회전 (Array Rotation)
• 핵심 개념
 • 인덱스 이동 (i + d)
 • 원형 구조 처리 (% n)
 • 경계 처리 제거
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] answer = new int[n];
        
        int d = direction.equals("right") ? 1 : -1;
        
        for(int i = 0; i < n; i++) {
            int next = (i + d + n) % n;
            answer[next] = numbers[i];
        }
        
        return answer;
    }
}
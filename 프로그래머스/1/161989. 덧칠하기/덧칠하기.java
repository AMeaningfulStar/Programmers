/*
• 알고리즘 유형: 그리디
• 핵심 개념
 • 왼쪽부터 처리
 • 이미 칠해진 구간 skip
 • 새로운 구간 시작 시 범위 갱신
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int ok = 0;
        
        for (int s : section) {
            if (ok < s) {
                answer++;
                ok = s + m - 1;
            }
        }
        
        return answer;
    }
}
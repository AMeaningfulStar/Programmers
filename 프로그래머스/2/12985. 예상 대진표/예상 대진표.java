/*
• 알고리즘 유형: 수학 / 시뮬레이션
• 핵심 개념
 • 토너먼트 트리
 • 부모 노드 이동: (x + 1) / 2
 • 만나는 조건: a == b
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
        
        return answer;
    }
}
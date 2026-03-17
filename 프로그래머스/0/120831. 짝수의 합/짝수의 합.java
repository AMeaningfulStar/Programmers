/*
• 알고리즘: 반복문 기반 누적 (Iteration & Accumulation)
• 핵심 개념
 • 일정 간격 반복 (num += 2)
 • 짝수만 선택적으로 순회
 • 누적 합 계산
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int num = 0; num <= n; num += 2) {
            answer += num;
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int n) {
        int k = n / 2;
        return k * (k + 1);
    }
}
*/
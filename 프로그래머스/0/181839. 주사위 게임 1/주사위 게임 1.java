/*
알고리즘: 조건 분기 (Branching Logic)
핵심 개념
• 홀수 / 짝수 판별 (% 2)
• 조건에 따라 다른 연산 수행
• 절댓값 계산 (Math.abs)
시간 복잡도: O(1)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(int a, int b) {
        if(a % 2 == 1 && b % 2 == 1) {
            return a * a + b * b;
        }

        if(a % 2 == 0 && b % 2 == 0) {
            return Math.abs(a - b);
        }

        return 2 * (a + b);
    }
}

/*
다른 풀이
class Solution {
    public int solution(int a, int b) {
        boolean oddA = a % 2 == 1;
        boolean oddB = b % 2 == 1;

        if(oddA && oddB) return a * a + b * b;
        if(!oddA && !oddB) return Math.abs(a - b);

        return 2 * (a + b);
    }
}
*/
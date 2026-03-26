/*
• 알고리즘: 조합 (Combination, nCr)
• 핵심 개념
 • 조합 공식 활용
 • 곱셈/나눗셈 순서 최적화
 • overflow 방지 (long)
 • 대칭성 활용 (nCr = nC(n-r))
• 시간 복잡도: O(r)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        
        for (int i = 0; i < share; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }
        
        return (int) answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int balls, int share) {
        share = Math.min(share, balls - share);
        
        long answer = 1;
        
        for (int i = 0; i < share; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }
        
        return (int) answer;
    }
}
*/
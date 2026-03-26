/*
• 알고리즘: 수학 계산 (Mathematical Calculation)
• 핵심 개념
 • 삼각형 부등식
 • 최댓값 / 최솟값 분리
 • 경우 나누기
 • 정수 개수 계산
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int sum = sides[0] + sides[1];
        
        answer = max - (max - min);
        
        answer += sum - max - 1;
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int[] sides) {
        return 2 * Math.min(sides[0], sides[1]) - 1;
    }
}
*/
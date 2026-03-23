/*
• 알고리즘: 정렬 + 그리디 선택
• 핵심 개념
 • 정렬 (Arrays.sort)
 • 극값 비교 (최댓값 vs 최솟값)
 • 음수 곱셈 고려
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                answer = numbers[i] * numbers[j] > answer ? numbers[i] * numbers[j] : answer;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int n = numbers.length;
        
        return Math.max(
            numbers[n-1] * numbers[n-2], // 가장 큰 두 수
            numbers[0] * numbers[1]      // 가장 작은 두 수 (음수)
        );
    }
}
*/
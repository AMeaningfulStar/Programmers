/*
• 알고리즘: 완전 탐색 (Brute Force)
• 핵심 개념
 • 이중 반복문을 통한 모든 조합 탐색
 • 두 수의 곱 계산
 • 최대값 갱신 (Math.max)
• 시간 복잡도: O(N²)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int n = numbers[i];
                int m = numbers[j];
                
                answer = Math.max(answer, n * m);
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        
        return numbers[n - 1] * numbers[n - 2];
    }
}

2.
class Solution {
    public int solution(int[] numbers) {
        int max1 = 0;
        int max2 = 0;

        for(int num : numbers) {
            if(num > max1) {
                max2 = max1;
                max1 = num;
            } else if(num > max2) {
                max2 = num;
            }
        }

        return max1 * max2;
    }
}
*/
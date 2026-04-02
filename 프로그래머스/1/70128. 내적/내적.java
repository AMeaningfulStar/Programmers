/*
• 알고리즘: 배열 순회
• 핵심 개념
 • 같은 인덱스 연산
 • 누적합
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length)
                        .map(i -> a[i] * b[i])
                        .sum();
    }
}
*/
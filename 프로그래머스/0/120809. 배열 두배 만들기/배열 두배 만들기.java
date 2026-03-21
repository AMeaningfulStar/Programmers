/*
• 알고리즘: 배열 순회 + 변환 (Array Traversal & Transformation)
• 핵심 개념
 • 배열 요소 순회
 • 각 요소 값 변환 (num * 2)
 • map을 이용한 데이터 변환
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers)
                     .map(num -> num * 2)
                     .toArray();
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}
*/
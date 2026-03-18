/*
• 알고리즘: 배열 슬라이싱 (Array Slicing)
• 핵심 개념
 • 특정 구간 추출
 • 시작 인덱스 ~ 끝 인덱스 접근
 • Java 배열 복사 (copyOfRange)
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        
        for(int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }
        
        return answer;
    }
}
*/
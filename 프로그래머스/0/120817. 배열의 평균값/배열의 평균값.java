/*
• 알고리즘: 배열 순회 + 산술 연산 (Array Traversal & Arithmetic Calculation)
• 핵심 개념
 • 배열 전체 합 계산
 • 배열 길이를 이용한 평균 계산
 • 정수 → 실수 캐스팅
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double answer = (double) Arrays.stream(numbers).sum() / numbers.length;
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        
        for(int num : numbers) {
            sum += num;
        }
        
        return (double) sum / numbers.length;
    }
}
*/
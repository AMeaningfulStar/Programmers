/*
• 알고리즘: 배열 순회 (Array Traversal)
• 핵심 개념
 • 배열 전체 순회
 • 조건 비교 (> height)
 • 조건 만족 개수 카운팅
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int num: array) {
            if(num > height) {
                answer += 1;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array)
                           .filter(num -> num > height)
                           .count();
    }
}
*/
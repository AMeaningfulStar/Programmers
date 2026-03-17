/*
• 알고리즘: 배열 순회 + 조건 판단 (Array Traversal & Conditional Check)
• 핵심 개념
 • 배열 전체 합 계산
 • 최댓값 찾기
 • 삼각형 조건 적용 (max < 나머지 합)
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] sides) {
        int max = 0, sum = 0;
        for (int num : sides) {
            sum += num;
            if (num > max) max = num;
        }
        return (sum - max) > max ? 1 : 2;
    }
}

/*
다른 풀이
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}
*/
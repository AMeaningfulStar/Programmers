/*
• 알고리즘: 배열 순회 + 카운팅 (Array Traversal & Counting)
• 핵심 개념
 • 배열 전체 순회
 • 조건 비교 (num == n)
 • 조건 만족 개수 증가
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int num: array) {
            if(num == n) answer += 1;    
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                           .filter(num -> num == n)
                           .count();
    }
}

2.
Map<Integer, Integer> map = new HashMap<>();

for(int num : array) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
*/
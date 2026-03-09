/*
알고리즘: 선형 탐색 (Linear Search)
핵심 개념
• 배열을 처음부터 끝까지 순회
• 찾는 값이 나오면 즉시 종료
시간 복잡도: O(N)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] num_list, int n) {
        for(int num: num_list) {
            if(num == n) return 1;
        }
        
        return 0;
    }
}

/*
다른 풀이
1. 
import java.util.Arrays;

return Arrays.stream(num_list)
             .anyMatch(num -> num == n) ? 1 : 0;

2.
return Arrays.stream(num_list)
             .boxed()
             .toList()
             .contains(n) ? 1 : 0;
*/
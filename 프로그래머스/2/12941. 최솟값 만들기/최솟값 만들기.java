/*
• 알고리즘: Greedy + 정렬
• 핵심 개념
 • 최소값 만들기 전략
 • 작은 값 × 큰 값
 • 정렬 후 반대 매칭
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution{
    public int solution(int[] A, int[] B){
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];   
        }

        return answer;
    }
}
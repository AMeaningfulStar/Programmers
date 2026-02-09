/*
알고리즘: 등차 수열 생성(선형 순회)
핵심 개념:
• k, 2k, 3k, ... 형태의 배수 수열 생성
• 배수 개수는 n / k
• 인덱스(idx)와 실제 값의 관계: (idx + 1) * k
• 고정 크기 배열을 이용한 결과 저장
시간 복잡도: O(n / k) (생성되는 배수 개수만큼)
공간 복잡도: O(n / k) (결과 배열 크기)
*/

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        
        for(int idx = 0; idx < answer.length; idx++) {
            answer[idx] = (idx + 1) * k;
        }
        
        /*
        다른 풀이
        for (int v = k, i = 0; v <= n; v += k) {
            answer[i++] = v;
        }
        */
        
        return answer;
    }
}
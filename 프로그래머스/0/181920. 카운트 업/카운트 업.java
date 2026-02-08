/*
알고리즘: 선형 순회
핵심 개념:
• 연속된 정수 구간 [start_num, end_num]을 배열로 변환
• 배열 인덱스 idx와 실제 값의 관계: 값 = start_num + idx
• 배열 길이 계산 시 포함 범위(+1) 주의
시간 복잡도: O(N) (N = end_num - start_num + 1)
공간 복잡도: O(N) (결과 배열 하나)
*/

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        
        for(int idx = 0; idx < answer.length; idx++){
            answer[idx] = start_num + idx;
        }
        
        /*
        다른 방법
        for (int i = start_num; i <= end_num; i++) {
            answer[i - start_num] = i;
        }
        */
        return answer;
    }
}
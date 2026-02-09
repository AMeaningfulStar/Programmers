/*
알고리즘: 등차 수열 생성(선형 순회)
핵심 개념:
• 감소 수열의 일반항: start_num - idx
• 포함 범위 수열의 길이 계산: start_num - end_num + 1
• 고정 크기 배열에 순서대로 값 채우기
시간 복잡도: O(N) (N = start_num - end_num + 1)
공간 복잡도: O(N) (결과 배열 크기)
*/

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        
        for(int idx = 0; idx < answer.length; idx++) {
            answer[idx] = start_num - idx;    
        }
        
        /*
        다른 풀이
        for (int i = start_num, idx = 0; i >= end_num; i--) {
            answer[idx++] = i;
        }
        */
        
        return answer;
    }
}
/*
알고리즘: 선형 순회 + 조건 분기 변환
핵심 개념:
• 배열을 한 번 순회하면서 각 원소를 독립적으로 처리
• 복합 조건 (범위 조건 + 짝/홀 조건)
• 결과를 새 배열에 저장
시간 복잡도: O(N)
공간 복잡도: O(N) (새 배열 생성)
*/

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int idx = 0; idx < answer.length; idx++) {
            if(arr[idx] >= 50 && arr[idx] % 2 == 0) {
                answer[idx] = arr[idx] / 2;
            } else if(arr[idx] < 50 && arr[idx] % 2 != 0) {
                answer[idx] = arr[idx] * 2;
            }else {
                answer[idx] = arr[idx];
            }
        }
        
        /*
        더 간결한 풀이
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (x >= 50 && x % 2 == 0) {
                answer[i] = x / 2;
            } else if (x < 50 && x % 2 == 1) {
                answer[i] = x * 2;
            } else {
                answer[i] = x;
            }
        }
        */
        
        return answer;
    }
}
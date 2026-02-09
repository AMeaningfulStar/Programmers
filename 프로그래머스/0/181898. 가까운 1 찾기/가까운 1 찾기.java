/*
알고리즘: 선형 탐색 (Linear Search)
핵심 개념:
• 배열을 특정 시작 인덱스부터 순차 탐색
• 조건 만족 시 즉시 반환(early exit)
• 조건 미충족 시 기본값 반환
시간 복잡도: O(N − idx) (최악의 경우 끝까지 탐색)
공간 복잡도: O(1) (추가 자료구조 사용 없음)
*/

class Solution {
    public int solution(int[] arr, int idx) {
        for(int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {
                return i;
            }
        }
        return -1;
        
        /*
        다른 풀이
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) return i;
        }
        return -1;  
        */
    }
}
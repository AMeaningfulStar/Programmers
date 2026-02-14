/*
알고리즘: 구간 업데이트 시뮬레이션(중첩 반복)
핵심 개념:
• 각 쿼리 [s, e]를 순서대로 처리
• 구간 [s..e]를 선형 순회하며 값 증가
• 배열을 제자리(in-place)에서 갱신
시간 복잡도: O(∑(e - s + 1)) (모든 쿼리 구간 길이의 합, 최악 O(Q*N))
공간 복잡도: O(1) (추가 자료구조 없이 입력 배열을 직접 수정)
*/

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q: queries) {
            int s = q[0];
            int e = q[1];
            
            for(int idx = s; idx <= e; idx++) {
                arr[idx]++;
            }
        }
        
        return arr;
    }
}
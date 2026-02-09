/*
알고리즘: 선형 탐색 (Linear Search)
핵심 개념:
• 배열을 앞에서부터 순차적으로 탐색
• 조건(num < 0)을 처음 만족하는 시점의 인덱스 반환
• 찾자마자 반환하는 조기 종료(early exit)
시간 복잡도: O(N) (N = num_list.length)
공간 복잡도: O(1) (추가 자료구조 사용 없음)
*/

class Solution {
    public int solution(int[] num_list) {
        for(int idx = 0; idx < num_list.length; idx++) {
            if(num_list[idx] < 0) return idx;
        }
        
        return -1;
    }
}
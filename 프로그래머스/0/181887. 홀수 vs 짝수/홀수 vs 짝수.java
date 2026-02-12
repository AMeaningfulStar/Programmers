/*
알고리즘: 선형 순회 + 조건 분기 누적
핵심 개념:
• 인덱스의 짝/홀 판별 (i % 2)
• 조건에 따라 두 변수에 누적
• 최종 비교는 Math.max
시간 복잡도: O(N)
공간 복잡도: O(1) (정수 변수 2개만 사용)
*/

class Solution {
    public int solution(int[] num_list) {
        int even_num = 0;
        int odd_num = 0;
        
        for(int idx = 0; idx < num_list.length; idx++) {
            if(idx % 2 == 0) {
                odd_num += num_list[idx];
            } else {
                even_num += num_list[idx];
            }
        }
        
        /*
        명확한 변수
        int evenIdxSum = 0;
        int oddIdxSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                evenIdxSum += num_list[i];
            } else {
                oddIdxSum += num_list[i];
            }
        }

        return Math.max(evenIdxSum, oddIdxSum);
        */
        
        return Math.max(even_num, odd_num);
    }
}
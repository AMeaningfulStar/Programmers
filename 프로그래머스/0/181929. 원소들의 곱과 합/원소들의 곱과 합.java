/*
알고리즘: 선형 순회
자료구조: int[]
시간 복잡도: O(N)
공간 복잡도: O(1)
*/
class Solution {
    public int solution(int[] num_list) {
        long product = 1;
        long sum = 0;

        for (int num : num_list) {
            product *= num;
            sum += num;
        }

        long squareOfSum = sum * sum;
        
        return product < squareOfSum ? 1 : 0;
    }
}
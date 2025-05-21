class Solution {
    public int solution(int[] numbers, int k) {
        int numbers_idx = 0;
        
        for(int turn = 1; turn < k; turn++) {
            numbers_idx += 2;
        }
        
        if(numbers_idx >= numbers.length) {
            numbers_idx = numbers_idx % numbers.length;
        }
        
        return numbers[numbers_idx];
    }
}
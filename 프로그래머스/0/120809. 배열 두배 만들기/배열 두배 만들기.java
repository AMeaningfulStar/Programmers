class Solution {
    public int[] solution(int[] numbers) {
        for(int idx = 0; idx < numbers.length; idx++) {
            numbers[idx] *= 2;
        }
        
        return numbers;
    }
}
class Solution {
    public double solution(int[] numbers) {
        int sum_val = 0;
        
        for(int num: numbers) {
            sum_val += num;
        }
        
        return (double) sum_val / numbers.length;
    }
}
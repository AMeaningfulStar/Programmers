class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int f_idx = 0; f_idx < numbers.length; f_idx++) {
            for(int s_idx = f_idx + 1; s_idx < numbers.length; s_idx++) {
                if(answer < numbers[f_idx] * numbers[s_idx]) {
                    answer = numbers[f_idx] * numbers[s_idx];
                }
            }
        }
        
        return answer;
    }
}
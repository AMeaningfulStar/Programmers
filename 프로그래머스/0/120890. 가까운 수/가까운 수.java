class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int num = Math.abs(array[0] - n);
        
        for(int idx = 0; idx < array.length; idx++) {
            if(Math.abs(array[idx] - n) < num) {
                num = Math.abs(array[idx] - n);
                answer = array[idx];
            } else if (Math.abs(array[idx] - n) == num && array[idx] < answer) {
                 answer = array[idx];
            }
        }
        
        return answer;
    }
}
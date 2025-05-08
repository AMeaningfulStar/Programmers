class Solution {
    public int[][] solution(int[][] arr) {
        int max_length = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[max_length][max_length];
        
        for(int x_idx = 0; x_idx < arr.length; x_idx++) {
            for(int y_idx = 0; y_idx < arr[0].length; y_idx++) {
                answer[x_idx][y_idx] = arr[x_idx][y_idx];
            }
        }
        
        return answer;
    }
}
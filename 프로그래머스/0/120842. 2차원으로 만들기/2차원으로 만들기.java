class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int num_list_idx = 0;
        
        for(int x_idx = 0; x_idx < num_list.length / n; x_idx++) {
            for(int y_idx = 0; y_idx < n; y_idx++) {
                answer[x_idx][y_idx] = num_list[num_list_idx];
                num_list_idx += 1;
            }
        }
        
        return answer;
    }
}
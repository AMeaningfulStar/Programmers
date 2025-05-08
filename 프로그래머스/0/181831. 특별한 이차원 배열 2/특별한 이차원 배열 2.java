class Solution {
    public int solution(int[][] arr) {
        for(int x_idx = 0; x_idx < arr.length; x_idx++) {
            for(int y_idx = 0; y_idx < arr.length; y_idx++) {
                if(arr[x_idx][y_idx] != arr[y_idx][x_idx]) {
                    return 0;
                }
            }
        }
        
        return 1;
    }
}
class Solution {
    public int[] solution(int[] array) {
        int max_num = 0;
        int max_value_idx = -1;
        
        for(int idx = 0; idx < array.length; idx++) {
            if(array[idx] >= max_num) {
                max_num = array[idx];
                max_value_idx = idx;
            }
        }
        
        return new int[]{max_num, max_value_idx};
    }
}
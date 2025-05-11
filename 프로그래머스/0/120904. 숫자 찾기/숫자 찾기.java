class Solution {
    public int solution(int num, int k) {
        String[] num_strs = Integer.toString(num).split("");
        
        for(int idx = 0; idx < num_strs.length; idx++){
            if(num_strs[idx].equals(Integer.toString(k))) {
                return idx + 1;
            }
        }
        
        return -1;
    }
}
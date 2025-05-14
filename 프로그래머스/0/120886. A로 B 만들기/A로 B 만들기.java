import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] before_arr = before.split("");
        String[] after_arr = after.split("");
        
        Arrays.sort(before_arr);
        Arrays.sort(after_arr);
        
        for(int idx = 0; idx < before_arr.length; idx++) {
            if(!before_arr[idx].equals(after_arr[idx])) {
                return 0;
            }
        }
        
        return 1;
    }
}
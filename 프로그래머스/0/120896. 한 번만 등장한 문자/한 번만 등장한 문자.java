import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str_arr = s.split("");
        String answer = "";
        
        Arrays.sort(str_arr);
        
        for(int idx = 0; idx < str_arr.length; idx++) {
            int count = 0;
            
            for(String str:str_arr) {
                if(str_arr[idx].equals(str)) {
                    count++;
                }
            }
            
            if(count == 1) {
                answer += str_arr[idx];
            }
        }
        
        
        
        return answer;
    }
}
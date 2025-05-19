import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String regExp = "^[0-9]+$";
        String num_string = "";
        
        for(String str:my_string.split("")){
            if(str.matches(regExp)) {
                num_string += str;
            }
        }
        
        int[] answer = new int[num_string.length()];
        
        for(int idx = 0; idx < num_string.length(); idx++) {
            answer[idx] = Integer.parseInt(num_string.split("")[idx]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
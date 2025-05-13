import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] str_arr = my_string.split("");
        String str = str_arr[num1];
        str_arr[num1] = str_arr[num2];
        str_arr[num2] = str;
        
        String answer = "";
        
        for(String item: str_arr) {
            answer += item;
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int idx = 0; idx < my_string.length(); idx++) {
            if(my_string.split("")[idx].matches("^[A-Z]+$")) {
                answer += my_string.split("")[idx].toLowerCase();
            } else {
                answer += my_string.split("")[idx].toUpperCase();
            }
        }
        
        return answer;
    }
}
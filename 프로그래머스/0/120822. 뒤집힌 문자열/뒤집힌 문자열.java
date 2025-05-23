class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int idx = my_string.length() - 1; idx >= 0; idx--) {
            answer += my_string.split("")[idx];
        }
        
        return answer;
    }
}
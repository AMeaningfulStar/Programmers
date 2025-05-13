class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int idx = code - 1; idx < cipher.length(); idx += code) {
            answer += cipher.split("")[idx];
        }
        
        return answer;
    }
}
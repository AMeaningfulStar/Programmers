class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(String str: my_string.split("")) {
            if(!str.equals("a") && !str.equals("e") && !str.equals("i") && !str.equals("o") && !str.equals("u")) {
                answer += str;
            }
        }
        
        return answer;
    }
}
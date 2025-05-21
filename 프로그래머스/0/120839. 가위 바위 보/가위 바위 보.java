class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(String str: rsp.split("")) {
            answer +=  str.equals("2") ? "0" : str.equals("0") ? "5" : "2";
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(String str:my_string.split("")) {
            for(int turn = 0; turn < n; turn++) {
                answer += str;
            }
        }
        
        return answer;
    }
}
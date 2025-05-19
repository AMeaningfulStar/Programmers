class Solution {
    public int solution(String my_string) {
        String regExp = "^[0-9]+$";
        int answer = 0;
        
        for(String str:my_string.split("")){
            if(str.matches(regExp)) {
                answer += Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}
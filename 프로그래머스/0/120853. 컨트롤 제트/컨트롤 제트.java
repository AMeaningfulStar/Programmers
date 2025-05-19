class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] s_arr = s.split(" ");
        
        for(int idx = 0; idx < s_arr.length; idx++){
            if(s_arr[idx].equals("Z") && (idx - 1) >= 0) {
                answer -= Integer.parseInt(s_arr[idx - 1]);
            } else {
                answer += Integer.parseInt(s_arr[idx]);
            }
        }
        
        return answer;
    }
}
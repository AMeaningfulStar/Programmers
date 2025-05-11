class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] num_list = Integer.toString(n).split("");
        
        for(String num: num_list) {
            answer += Integer.parseInt(num);
        }
        
        return answer;
    }
}
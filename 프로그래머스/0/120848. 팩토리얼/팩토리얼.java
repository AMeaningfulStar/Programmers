class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int value = 1;
        
        while(true) {
            num *= value;
            if(num > n) {
                answer = value - 1;
                break;
            }
            value++;
        }
        
        return answer;
    }
}
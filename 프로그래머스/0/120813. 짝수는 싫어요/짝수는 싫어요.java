class Solution {
    public int[] solution(int n) {
        int size = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[size];
        int idx = 0;
        for(int num = 1; num <= n; num+=2){
            answer[idx] = num;
            
            if(idx + 1 < size) {
                idx++;
            }
        }
        
        return answer;
    }
}
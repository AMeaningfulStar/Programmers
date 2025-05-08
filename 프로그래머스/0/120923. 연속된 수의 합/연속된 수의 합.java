class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int start_num = (total/num) - ((num - 1)/2);
        
        for(int i = 0; i < num; i++) {
            answer[i] = start_num;
            start_num++;
        }
        
        return answer;
    }
}
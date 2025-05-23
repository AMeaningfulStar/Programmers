class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int idx = 0; idx < num_list.length; idx++) {
            answer[idx] = num_list[num_list.length - idx - 1];
        }
        
        return answer;
    }
}
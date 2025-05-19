class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0, 0};
        
        for(String key:keyinput) {
            if(key.equals("left")) {
                answer[0]--;
                if(answer[0] < -(int)(board[0] / 2))
                    answer[0] = -(int)(board[0] / 2);
            } else if (key.equals("right")) {
                answer[0]++;
                if(answer[0] > (int)(board[0] / 2))
                    answer[0] = (int)(board[0] / 2);
            } else if (key.equals("up")) {
                answer[1]++;
                if(answer[1] > (int)(board[1] / 2))
                    answer[1] = (int)(board[1] / 2);
            } else {
                answer[1]--;
                if(answer[1] < -(int)(board[1] / 2))
                    answer[1] = -(int)(board[1] / 2);
            } 
        }
        
        return answer;
    }
}
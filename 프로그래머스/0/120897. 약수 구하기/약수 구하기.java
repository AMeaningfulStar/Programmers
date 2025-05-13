import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> num_list = new ArrayList<>();
        
        for(int num = 1; num <= n; num++) {
            if(n % num == 0) {
                num_list.add(num);
            }
        }
        
        int[] answer = new int[num_list.size()];
        
        for(int idx = 0; idx < num_list.size(); idx++) {
            answer[idx] = num_list.get(idx);
        }
    
        return answer;
    }
}
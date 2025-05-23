class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        int i = 1;
    
        while(count != n){
            if(i % 3 != 0 && i % 10 != 3 && (i / 10) % 10 != 3){
                answer = i;
                count++;
            }
            
            i++;
        }
        
        return answer;
    }
}
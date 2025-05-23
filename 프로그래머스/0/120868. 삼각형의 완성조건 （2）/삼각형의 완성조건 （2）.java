class Solution {
    public int solution(int[] sides) {
        int max_side = Math.max(sides[0], sides[1]);
        int min_side = Math.min(sides[0], sides[1]);
        int answer = 0;
        
        for(int side = 1; side <= max_side; side++){
            if(side + min_side > max_side){
                answer += 1;
            }
        }
        
        for(int side = max_side + 1; side < max_side + min_side; side++) {
            answer++;
        }
        
        return answer;
    }
}
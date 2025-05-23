class Solution {
    public int solution(int[][] lines) {
        int[] field = new int[201];
        
        for(int[] line:lines) {
            for(int check = line[0] + 100; check < line[1] + 100; check++) {
                field[check]++;
            }
        }
        
        int answer = 0;
        
        for(int idx = 0; idx < field.length; idx++) {
            if(field[idx] > 1) {
                answer++;
            }
        }
        
        
        
        return answer;
    }
}
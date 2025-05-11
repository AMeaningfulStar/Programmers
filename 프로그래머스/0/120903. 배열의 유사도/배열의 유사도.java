class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int s1_idx = 0; s1_idx < s1.length; s1_idx++) {
            for(int s2_idx = 0; s2_idx < s2.length; s2_idx++) {
                if(s1[s1_idx].equals(s2[s2_idx])) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
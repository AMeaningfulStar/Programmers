class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int max_num = 1;
        
        for(int num = 1; num <= numer && num <= denom; num++) {
            if (numer % num == 0 && denom % num == 0) {
                max_num = num;
            }
        }
        
        int[] answer = new int[]{ numer / max_num, denom / max_num };
        
        return answer;
    }
}
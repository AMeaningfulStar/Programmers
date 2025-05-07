class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
		
		for(int idx = 0; idx < n; idx++) {
			answer[idx][idx] = 1;
		}
		
		return answer;
    }
}
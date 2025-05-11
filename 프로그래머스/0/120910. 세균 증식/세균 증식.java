class Solution {
    public int solution(int n, int t) {
        int answer = n;
		
		for(int count = 0; count < t; count++) {
			answer *= 2;
		}
		return answer;
    }
}
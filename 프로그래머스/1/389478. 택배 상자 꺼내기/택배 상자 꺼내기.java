class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
		
		int n_row = (n - 1) / w;
		int n_index = n_row % 2 == 0 ? (n - 1) % w : w - 1 - ((n - 1) % w);

		int num_row = (num - 1) / w;
		int num_index = num_row % 2 == 0 ? (num - 1) % w : w - 1 - ((num - 1) % w);
		
		answer = n_row - num_row;
		
		if(n_row % 2 == 0) {
			answer += (n_index >= num_index) ? 1 : 0;
		} else {
			answer += (n_index <= num_index) ? 1 : 0;
		}
		
        return answer;
    }
}
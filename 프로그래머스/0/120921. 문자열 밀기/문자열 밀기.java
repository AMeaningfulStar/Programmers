class Solution {
    public int solution(String A, String B) {
        int answer = -1;

		for (int idx = 0; idx < A.length(); idx++) {
			if (A.equals(B)) {
				return idx;
			}

			A = A.split("")[A.length() - 1] + A.substring(0, A.length() - 1);
		}

		return answer;
    }
}
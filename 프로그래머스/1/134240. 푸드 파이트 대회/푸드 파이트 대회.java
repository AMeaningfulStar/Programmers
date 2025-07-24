class Solution {
    public String solution(int[] food) {
        String answer = "";

		for (int idx = 1; idx < food.length; idx++) {
			for (int count = 0; count < food[idx] / 2; count++) {
				answer += Integer.toString(idx);
			}
		}

		String reverse = "";

		for (int idx = answer.length() - 1; idx > -1; idx--) {
			reverse += answer.charAt(idx);
		}

		return answer + "0" + reverse;
    }
}
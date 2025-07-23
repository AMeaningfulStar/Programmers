class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
		String[] strArr = s.split(""); // 한 번만 split 수행

		for (int turn = 0; turn < s.length(); turn++) {
			answer[turn] = -1;
			for (int idx = turn - 1; idx >= 0; idx--) {
				if (strArr[turn].equals(strArr[idx])) {
					answer[turn] = turn - idx;
					break;
				}
			}
		}

		return answer;
    }
}
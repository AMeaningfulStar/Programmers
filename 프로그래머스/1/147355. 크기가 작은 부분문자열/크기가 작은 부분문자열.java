class Solution {
    public int solution(String t, String p) {
        int answer = 0;

		for (int idx = 0; idx <= t.length() - p.length(); idx++) {
			String num = t.substring(idx, idx + p.length());

			if (Long.parseLong(num) <= Long.parseLong(p)) {
				answer++;
			}
		}

		return answer;
	}
}
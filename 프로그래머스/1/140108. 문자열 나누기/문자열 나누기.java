class Solution {
    public int solution(String s) {
        int answer = 0;
		int same = 0;
		int diff = 0;
		char target = s.charAt(0); // 첫 글자를 기준으로

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == target) {
				same++;
			} else {
				diff++;
			}

			// 같은 수와 다른 수가 같아지면 끊고 다음 시작
			if (same == diff) {
				answer++;
				if (i + 1 < s.length()) {
					target = s.charAt(i + 1);
				}
				same = 0;
				diff = 0;
			}
		}

		// 문자열 끝까지 가도 남아있는 부분이 있다면 1 추가
		if (same != 0 || diff != 0) {
			answer++;
		}

		return answer;
    }
}
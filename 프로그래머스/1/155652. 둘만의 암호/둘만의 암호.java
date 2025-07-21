class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

		for (char s_chr : s.toCharArray()) {
			int count = 0;
			char current = s_chr;

			while (count < index) {
				current++;
				if (current > 'z') {
					current = 'a'; // z를 넘어가면 다시 a부터 시작
				}

				if (!skip.contains(String.valueOf(current))) {
					count++;
				}
			}

			answer += current;
		}

		return answer;
    }
}
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
		String[] arr = new String[] { "aya", "ye", "woo", "ma" };

		for (String b : babbling) {
			String temp = b;
			String lastWord = "";

			boolean isValid = true;

			while (!temp.isEmpty()) {
				boolean matched = false;

				for (String word : arr) {
					if (temp.startsWith(word) && !word.equals(lastWord)) {
						temp = temp.substring(word.length());
						lastWord = word;
						matched = true;
						break;
					}
				}

				if (!matched) {
					isValid = false;
					break;
				}
			}

			if (isValid) {
				answer++;
			}
		}

		return answer;
    }
}
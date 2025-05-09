class Solution {
    public String[] solution(String my_str, int n) {
        int strLen = my_str.length();
		int answerLength = (strLen + n - 1) / n; // 문자열 길이를 n으로 나눈 몫, 올림
		String[] answer = new String[answerLength];

		int startIdx = 0;

		for (int i = 0; i < answerLength; i++) {
			int endIdx = Math.min(startIdx + n, strLen); // 문자열 끝을 넘지 않도록
			answer[i] = my_str.substring(startIdx, endIdx);
			startIdx += n;
		}

		return answer;
    }
}
/*
• 알고리즘: 문자열 분할 (String Chunking)
• 핵심 개념
 • 올림 나눗셈 (ceil division)
 • substring 범위 처리
 • 인덱스 기반 분할
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String[] solution(String my_str, int n) {
        int strLen = my_str.length();
		int answerLength = (strLen + n - 1) / n;
		String[] answer = new String[answerLength];

		int startIdx = 0;

		for (int i = 0; i < answerLength; i++) {
			int endIdx = Math.min(startIdx + n, strLen);
			answer[i] = my_str.substring(startIdx, endIdx);
			startIdx += n;
		}

		return answer;
    }
}

/*
class Solution {
    public String[] solution(String my_str, int n) {
        int len = (my_str.length() + n - 1) / n;
        String[] answer = new String[len];
        
        for(int i = 0; i < len; i++) {
            int start = i * n;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}
*/
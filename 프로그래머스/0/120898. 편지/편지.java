/*
• 알고리즘: 문자열 처리 (String Manipulation)
• 핵심 개념
 • 문자열 길이 계산 (length())
 • 길이에 따른 값 계산
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}

/*
간결한 풀이
class Solution {
    public int solution(String message) {
        return message.length() * 2;
    }
}
*/
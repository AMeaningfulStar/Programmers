/*
• 알고리즘: 문자열 + 수학 (mod 연산)
• 핵심 개념
 • 알파벳 index 변환 (c - 'a', c - 'A')
 • 순환 처리 (% 26)
 • 다시 문자로 복원
• 시간 복잡도: O(n)
• 공간 복잡도: O(n)
*/

class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(' ');
            } else if (Character.isUpperCase(c)) {
                answer.append((char) ('A' + (c - 'A' + n) % 26));
            } else {
                answer.append((char) ('a' + (c - 'a' + n) % 26));
            }
        }
        
        return answer.toString();
    }
}
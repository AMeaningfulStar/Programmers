/*
• 알고리즘: 문자열 순회
• 핵심 개념
 • 공백 유지
 • 단어 시작 여부 관리 (flag)
 • 대소문자 변환
• 시간 복잡도: O(n)
• 공간 복잡도: O(n)
*/

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirst = true;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(' ');
                isFirst = true;
            } else {
                if (isFirst) {
                    answer.append(Character.toUpperCase(c));
                    isFirst = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }
        
        return answer.toString();
    }
}
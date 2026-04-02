/*
• 알고리즘: 문자열 처리
• 핵심 개념
 • 공백 기준 단어 분리
 • 인덱스 리셋
 • 대소문자 변환
• 시간 복잡도: O(n)
• 공간 복잡도: O(n)
*/

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(' ');
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                idx++;
            }
        }
        
        return answer.toString();
    }
}
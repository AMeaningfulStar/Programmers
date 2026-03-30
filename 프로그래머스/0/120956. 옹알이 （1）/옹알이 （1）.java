/*
• 알고리즘: 문자열 패턴 제거
• 핵심 개념
 • 문자열 치환 (replace)
 • 금지 패턴 체크 (contains)
 • 최종 검증 (isEmpty)
• 시간 복잡도: O(N × 문자열 길이)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speak = {"aya", "ye", "woo", "ma"};
        
        for (String babb : babbling) {
            if (babb.contains("ayaaya") || babb.contains("yeye") ||
                babb.contains("woowoo") || babb.contains("mama")) {
                continue;
            }
            
            for (String s : speak) {
                babb = babb.replace(s, " ");
            }
            
            if (babb.trim().isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}
/*
• 알고리즘 유형: 문자열 + 구현
• 핵심 개념
 • index 기반 탐색
 • startsWith(offset)
 • 이전 값 추적
• 시간 복잡도: O(N × 길이 × 4)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String babb : babbling) {
            int idx = 0;
            String prev = "";
            boolean isValid = true;
            
            while (idx < babb.length()) {
                boolean matched = false;
                
                for (String word : words) {
                    if (babb.startsWith(word, idx) && !word.equals(prev)) {
                        idx += word.length();
                        prev = word;
                        matched = true;
                        break;
                    }
                }
                
                if (!matched) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) answer++;
        }
        
        return answer;
    }
}
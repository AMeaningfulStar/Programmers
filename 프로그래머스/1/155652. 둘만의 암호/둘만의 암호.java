/*
• 알고리즘 유형: 문자열 / 구현 / 시뮬레이션
• 핵심 개념
 • 알파벳 한 칸씩 이동
 • z 다음은 a
 • skip 문자는 건너뛰기
 • 유효한 문자만 count 증가
• 시간 복잡도: O(|s| × index) 정도
• 공간 복잡도: O(1)
*/

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int count = 0;
            char current = c;
            
            while (count < index) {
                current++;
                
                if (current > 'z') {
                    current = 'a';
                }
                
                if (!skip.contains(String.valueOf(current))) {
                    count++;
                }
            }
            
            answer.append(current);
        }
        
        return answer.toString();
    }
}
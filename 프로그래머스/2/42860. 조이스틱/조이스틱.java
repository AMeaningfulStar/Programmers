/*
• 알고리즘 유형: 그리디 / 문자열
• 핵심 개념: 연속된 A 구간 건너뛰기
• 시간 복잡도: O(N²)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        
        int move = len - 1;
        
        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            
            answer += Math.min(c - 'A', 'Z' - c + 1);
            
            int next = i + 1;
            
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }
            
            move = Math.min(move, i * 2 + len - next);
            
            move = Math.min(move, i + (len - next) * 2);
        }
        
        return answer + move;
    }
}
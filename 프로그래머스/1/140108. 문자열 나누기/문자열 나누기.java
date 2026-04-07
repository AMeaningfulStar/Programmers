/*
• 알고리즘 유형: 문자열 / 구현 / 그리디
• 핵심 개념
 • 기준 문자 설정
 • 같은 문자 수 / 다른 문자 수 카운트
 • 같아지는 순간 분리
 • 마지막 남은 구간 처리
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char target = 0;
        int same = 0;
        int different = 0;
        
        for (char c : s.toCharArray()) {
            if (same == 0 && different == 0) {
                target = c;
                same++;
                continue;
            }
            
            if (target == c) same++;
            else different++;
            
            if (same == different) {
                answer++;
                same = 0;
                different = 0;
            }
        }
        
        if (same != 0 || different != 0) answer++;
        
        return answer;
    }
}
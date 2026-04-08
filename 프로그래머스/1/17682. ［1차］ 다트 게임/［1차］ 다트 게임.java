/*
• 알고리즘 유형: 문자열 파싱 / 구현
• 핵심 개념
 • 숫자 추출 (10 처리)
 • S/D/T 처리
 • * / # 옵션 처리
 • 이전 값 영향
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = -1;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            // 숫자 처리
            if (Character.isDigit(c)) {
                idx++;
                
                // 10 처리
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    score[idx] = 10;
                    i++;
                } else {
                    score[idx] = c - '0';
                }
            }
            
            // 보너스
            else if (c == 'S') {
                score[idx] = (int)Math.pow(score[idx], 1);
            } else if (c == 'D') {
                score[idx] = (int)Math.pow(score[idx], 2);
            } else if (c == 'T') {
                score[idx] = (int)Math.pow(score[idx], 3);
            }
            
            // 옵션
            else if (c == '*') {
                score[idx] *= 2;
                if (idx > 0) score[idx - 1] *= 2;
            } else if (c == '#') {
                score[idx] *= -1;
            }
        }
        
        return score[0] + score[1] + score[2];
    }
}
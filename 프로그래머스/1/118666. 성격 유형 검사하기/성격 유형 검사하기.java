/*
• 알고리즘 유형: 구현 / 해시맵
• 핵심 개념
 • 선택지에 따른 좌/우 점수 배분
 • 점수 = |choice - 4|
 • 문자별 점수 누적
 • 지표별 비교 후 결과 문자열 생성
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < survey.length; i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            int choice = choices[i];
            int score = Math.abs(choice - 4);
            
            if (choice < 4) {
                map.put(left, map.getOrDefault(left, 0) + score);
            } else if (choice > 4) {
                map.put(right, map.getOrDefault(right, 0) + score);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        answer.append(getType(map, 'R', 'T'));
        answer.append(getType(map, 'C', 'F'));
        answer.append(getType(map, 'J', 'M'));
        answer.append(getType(map, 'A', 'N'));
        
        return answer.toString();
    }
    
    private char getType(Map<Character, Integer> map, char a, char b) {
        int scoreA = map.getOrDefault(a, 0);
        int scoreB = map.getOrDefault(b, 0);
        
        if (scoreA >= scoreB) return a;
        return b;
    }
}
/*
• 알고리즘 유형: 문자열 / 구현
• 핵심 개념
 • # 음표를 별도 문자로 치환
 • 재생 시간 계산
 • 재생 시간만큼 멜로디 반복 생성
 • 포함 여부 검사 후 최적 곡 선택
• 시간 복잡도: 입력 곡 수 × 재생 멜로디 길이 정도
• 공간 복잡도: 생성한 멜로디 길이에 비례
*/

import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int answerTime = 0;
        
        m = toMelody(m);
        
        for(String musicinfo : musicinfos) {
            String[] info = musicinfo.split(",");
            int playTime = toTime(info[1]) - toTime(info[0]);
            String title = info[2];
            char[] codes = toMelody(info[3]).toCharArray();
            
            StringBuilder melody = new StringBuilder();
            int idx = 0;
            
            while(melody.length() < playTime) {
                melody.append(codes[idx]);
                
                idx = (idx + 1) % codes.length;
            }
            
            if(melody.toString().contains(m)) {
                if(answerTime < playTime) {
                    answer = title;
                    answerTime = playTime;
                }
            }
        }
        
        return answer;
    }
    
    private String toMelody(String melody) {
        StringBuilder sb = new StringBuilder();
        char[] chars = melody.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '#') {
                continue;
            }
            
            if(i < chars.length - 1 && chars[i + 1] == '#') {
                sb.append(Character.toLowerCase(chars[i]));
            } else {
                sb.append(chars[i]);
            }
        }
        
        return sb.toString();
    }
    
    private int toTime(String str){
        String[] data = str.split(":");
        
        int hour = Integer.parseInt(data[0]) * 60;
        int minute = Integer.parseInt(data[1]);
        
        return hour + minute;
    }
}
/*
• 알고리즘 유형: 문자열 / 해시맵
• 핵심 개념
 • 문자별 최소 입력 횟수 저장
 • target 문자열 순회하며 누적
 • 없는 문자면 -1
• 시간 복잡도:
 • 현재 코드: O(타겟 전체 길이 × keymap 탐색)
 • 추천 코드: O(keymap 전체 길이 + target 전체 길이)
• 공간 복잡도: O(문자 종류 수)
*/

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        
        // 각 문자별 최소 입력 횟수 저장
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), i + 1));
            }
        }
        
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            boolean possible = true;
            
            for (char c : targets[i].toCharArray()) {
                if (!map.containsKey(c)) {
                    possible = false;
                    break;
                }
                sum += map.get(c);
            }
            
            answer[i] = possible ? sum : -1;
        }
        
        return answer;
    }
}
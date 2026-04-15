/*
• 알고리즘 유형: 문자열 / 해시맵 / 구현
• 핵심 개념
 • 사전에 있는 가장 긴 문자열 찾기
 • 그 문자열 번호 출력
 • 문자열 + 다음 글자 사전에 추가
 • 현재 위치를 문자열 길이만큼 이동
• 시간 복잡도: 대략 O(N²)까지 가능하지만 입력 범위에서 충분
• 공간 복잡도: O(사전 크기)
*/

import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char)('A' + i)), i + 1);
        }
        
        List<Integer> answer = new ArrayList<>();
        int idx = 0;
        
        while (idx < msg.length()) {
            String w = "";
            int num = 0;
            
            // 사전에 있는 가장 긴 문자열 찾기
            for (int i = idx; i < msg.length(); i++) {
                String next = msg.substring(idx, i + 1);
                
                if (map.containsKey(next)) {
                    w = next;
                    num = map.get(next);
                } else {
                    // w + 다음 글자 사전에 추가
                    map.put(next, map.size() + 1);
                    break;
                }
            }
            
            answer.add(num);
            idx += w.length();
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
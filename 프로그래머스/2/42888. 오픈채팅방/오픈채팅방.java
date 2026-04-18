/*
• 알고리즘 유형: 해시맵 / 문자열 / 구현
• 핵심 개념
 • 최종 닉네임 먼저 확정
 • Enter / Change는 닉네임 갱신
 • Enter / Leave만 출력
 • 기록은 2번 순회
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> nicknameMap = new HashMap<>();
        
        for(String r: record) {
            String[] arr = r.split(" ");
            String action = arr[0];
            String userId = arr[1];
            
            if(action.equals("Enter") || action.equals("Change")) {
                String nickname = arr[2];
                nicknameMap.put(userId, nickname);
            }
        }
        
        List<String> answer = new ArrayList<>();
        
        for(String r: record) {
            String[] arr = r.split(" ");
            String action = arr[0];
            String userId = arr[1];
            
            if(action.equals("Enter")) {
                answer.add(nicknameMap.get(userId) + "님이 들어왔습니다.");
            } else if(action.equals("Leave")) {
                answer.add(nicknameMap.get(userId) + "님이 나갔습니다.");
            }
        }
        
        return answer.toArray(new String[0]);
    }
}
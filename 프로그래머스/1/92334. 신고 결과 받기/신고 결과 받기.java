/*
• 알고리즘 유형: 해시 / 구현
• 핵심 개념
 • 중복 신고 제거 → Set
 • 신고당한 횟수 → Map
 • 정지된 유저를 신고한 사람 메일 수 계산 → Map
• 시간 복잡도: O(R + U)
 R: 신고 수, U: 유저 수
• 공간 복잡도: O(R + U)
*/

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        Map<String, Integer> reportedCount = new HashMap<>();
        Map<String, Integer> mailCount = new HashMap<>();
        
        // 초기화
        for (String id : id_list) {
            reportedCount.put(id, 0);
            mailCount.put(id, 0);
        }
        
        // 1. 신고당한 횟수 세기
        for (String r : reportSet) {
            String[] split = r.split(" ");
            String reported = split[1];
            
            reportedCount.put(reported, reportedCount.get(reported) + 1);
        }
        
        // 2. 정지된 유저를 신고한 사람에게 메일 주기
        for (String r : reportSet) {
            String[] split = r.split(" ");
            String reporter = split[0];
            String reported = split[1];
            
            if (reportedCount.get(reported) >= k) {
                mailCount.put(reporter, mailCount.get(reporter) + 1);
            }
        }
        
        // 3. id_list 순서대로 결과 만들기
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.get(id_list[i]);
        }
        
        return answer;
    }
}
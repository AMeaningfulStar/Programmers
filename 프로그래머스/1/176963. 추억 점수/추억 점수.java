/*
• 알고리즘: 해시맵 기반 탐색
• 핵심 개념
 • 이름 → 점수 매핑
 • 사진별 합산
 • 없는 이름은 무시 또는 0 처리
• 시간 복잡도: O(N + P×K)
 • N: name 길이
 • P: photo 개수
 • K: 각 사진의 평균 인원 수
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            
            for (String person : photo[i]) {
                sum += map.getOrDefault(person, 0);
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
}
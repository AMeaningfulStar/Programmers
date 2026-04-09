/*
• 알고리즘 유형: 구현 / 거리 계산
• 핵심 개념
 • 키패드를 좌표로 변환
 • 왼손/오른손 현재 위치 관리
 • 가운데 열은 맨해튼 거리 비교
 • 거리 같으면 주손 사용
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        Map<String, int[]> map = new HashMap<>();
        map.put("1", new int[]{0, 0});
        map.put("2", new int[]{0, 1});
        map.put("3", new int[]{0, 2});
        map.put("4", new int[]{1, 0});
        map.put("5", new int[]{1, 1});
        map.put("6", new int[]{1, 2});
        map.put("7", new int[]{2, 0});
        map.put("8", new int[]{2, 1});
        map.put("9", new int[]{2, 2});
        map.put("*", new int[]{3, 0});
        map.put("0", new int[]{3, 1});
        map.put("#", new int[]{3, 2});
        
        int[] left = map.get("*");
        int[] right = map.get("#");
        
        StringBuilder answer = new StringBuilder();
        
        for (int num : numbers) {
            String key = Integer.toString(num);
            
            if (num == 1 || num == 4 || num == 7) {
                left = map.get(key);
                answer.append("L");
                continue;
            }
            
            if (num == 3 || num == 6 || num == 9) {
                right = map.get(key);
                answer.append("R");
                continue;
            }
            
            int[] target = map.get(key);
            int l = Math.abs(target[0] - left[0]) + Math.abs(target[1] - left[1]);
            int r = Math.abs(target[0] - right[0]) + Math.abs(target[1] - right[1]);
            
            if (l == r) {
                if (hand.equals("right")) {
                    right = target;
                    answer.append("R");
                } else {
                    left = target;
                    answer.append("L");
                }
            } else if (l > r) {
                right = target;
                answer.append("R");
            } else {
                left = target;
                answer.append("L");
            }
        }
        
        return answer.toString();
    }
}
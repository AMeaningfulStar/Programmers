/*
• 알고리즘 유형: 해시맵 / DFS / 이분 탐색
• 핵심 개념: 조건 조합 사전 생성, 점수 리스트 정렬, lowerBound
• 시간 복잡도: O(info × 16 + query × logN)
• 공간 복잡도: O(info × 16)
*/

import java.util.*;

class Solution {
    Map<String, List<Integer>> map = new HashMap<>();
    
    public int[] solution(String[] info, String[] query) {
        for (String data : info) {
            String[] arr = data.split(" ");
            String[] conditions = {arr[0], arr[1], arr[2], arr[3]};
            int score = Integer.parseInt(arr[4]);
            
            makeKey(0, "", conditions, score);
        }
        
        for (List<Integer> scores : map.values()) {
            Collections.sort(scores);
        }
        
        int[] answer = new int[query.length];
        
        for (int i = 0; i < query.length; i++) {
            String q = query[i].replace(" and ", " ");
            String[] arr = q.split(" ");
            
            String key = arr[0] + arr[1] + arr[2] + arr[3];
            int score = Integer.parseInt(arr[4]);
            
            if (!map.containsKey(key)) {
                answer[i] = 0;
            } else {
                List<Integer> scores = map.get(key);
                int idx = lowerBound(scores, score);
                answer[i] = scores.size() - idx;
            }
        }
        
        return answer;
    }
    
    private void makeKey(int depth, String key, String[] conditions, int score) {
        if (depth == 4) {
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(score);
            return;
        }
        
        makeKey(depth + 1, key + conditions[depth], conditions, score);
        makeKey(depth + 1, key + "-", conditions, score);
    }
    
    private int lowerBound(List<Integer> scores, int target) {
        int left = 0;
        int right = scores.size();
        
        while (left < right) {
            int mid = (left + right) / 2;
            
            if (scores.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}
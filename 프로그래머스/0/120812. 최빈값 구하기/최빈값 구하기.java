import java.util.*;

class Solution {
    public int solution(int[] array) {
        // 각 값이 나타난 횟수를 저장할 Map
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // 배열을 돌면서 각 값이 나타난 횟수를 카운트
        for(int num : array) {
            // Map의 put 메서드로 값을 카운트
            // 만약 해당 키(num)가 존재하지 않으면 기본값으로 0을 사용
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int maxCount = 0; // 가장 많이 나타난 횟수
        int answer = 0; // 최빈값
        
        // Map을 돌면서 가장 많이 나타난 횟수와 값 찾기
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if(count > maxCount) {
                // 가장 많이 나타난 횟수와 값 업데이트
                maxCount = count;
                answer = num;
            } else if(count == maxCount) {
                // 최빈값이 여러 개 일 경우, -1 반환
                answer = -1;
            }
        }
        return answer;
    }
}
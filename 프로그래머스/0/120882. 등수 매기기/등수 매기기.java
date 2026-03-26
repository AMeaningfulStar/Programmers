/*
• 알고리즘: 브루트포스 비교 기반 랭킹
• 핵심 개념
 • 모든 요소 비교 (이중 반복문)
 • 상대 비교 기반 순위 계산
 • 합 비교로 최적화
 • 공동 등수 처리
• 시간 복잡도: O(N²)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            int target = score[i][0] + score[i][1];
            int rank = 1;
            
            for (int j = 0; j < score.length; j++) {
                int sum = score[j][0] + score[j][1];
                
                if (target < sum) {
                    rank++;
                }
            }
            
            answer[i] = rank;
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        int[] sums = new int[n];
        
        for (int i = 0; i < n; i++) {
            sums[i] = score[i][0] + score[i][1];
        }
        
        int[] sorted = sums.clone();
        Arrays.sort(sorted);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        
        int rank = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (!rankMap.containsKey(sorted[i])) {
                rankMap.put(sorted[i], n - i);
            }
        }
        
        for (int i = 0; i < n; i++) {
            answer[i] = rankMap.get(sums[i]);
        }
        
        return answer;
    }
}
*/
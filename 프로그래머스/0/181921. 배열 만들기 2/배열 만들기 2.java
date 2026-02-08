/*
알고리즘: 선형 순회 + 자릿수 검사
핵심 개념:
• 범위 [l, r]를 순회하며 후보 탐색
• 각 숫자를 % 10, /= 10으로 자릿수 분해
• 자릿수가 {0, 5}에만 속하는지 필터링
• 결과를 List에 모은 뒤 int[]로 변환
시간 복잡도: O((r - l + 1) * D)  (D = 자릿수 개수)
공간 복잡도: O(K) (K = 조건을 만족하는 숫자 개수)
*/

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int x = l; x <= r; x++) {
            if (onlyZeroOrFive(x)) {
                list.add(x);
            }
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    private boolean onlyZeroOrFive(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) return false;
            num /= 10;
        }
        
        return true; 
    }
}
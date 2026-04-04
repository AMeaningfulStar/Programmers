/*
• 알고리즘 유형: Set / Greedy
• 핵심 개념
 • 중복 제거 → Set
 • 최대 선택 수 제한
 • 최소값 선택 (min)
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        return Math.min(set.size(), nums.length / 2);
    }
}
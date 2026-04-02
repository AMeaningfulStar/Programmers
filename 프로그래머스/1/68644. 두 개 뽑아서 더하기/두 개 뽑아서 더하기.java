/*
• 알고리즘: 조합 + Set
• 핵심 개념
 • 두 개 선택 (i < j)
 • 중복 제거 → Set
 • 정렬 → stream.sorted()
• 시간 복잡도: O(n²)
• 공간 복잡도: O(n²)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        return set.stream()
                  .sorted()
                  .mapToInt(i -> i)
                  .toArray();
    }
}
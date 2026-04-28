/*
• 알고리즘 유형: 재귀
• 핵심 개념
 • n-1개: 출발 → 보조
 • 가장 큰 1개: 출발 → 목표
 • n-1개: 보조 → 목표
• 시간 복잡도: O(2ⁿ)
• 공간 복잡도: O(2ⁿ)
*/

import java.util.*;

class Solution {
    List<int[]> result = new ArrayList<>();
    
    public int[][] solution(int n) {
        move(n, 1, 3, 2);
        return result.toArray(new int[result.size()][]);
    }
    
    private void move(int n, int from, int to, int via) {
        if (n == 1) {
            result.add(new int[]{from, to});
            return;
        }
        
        move(n - 1, from, via, to);
        result.add(new int[]{from, to});
        move(n - 1, via, to, from);
    }
}
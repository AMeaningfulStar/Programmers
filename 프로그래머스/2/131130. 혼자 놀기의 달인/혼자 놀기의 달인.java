/*
• 알고리즘 유형: 그래프 탐색 / 사이클
• 핵심 개념: cards[i] - 1을 다음 노드로 보고 그룹 크기 계산
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    boolean[] visited;

    public int solution(int[] cards) {
        visited = new boolean[cards.length];
        List<Integer> groupSizes = new ArrayList<>();
        
        for (int i = 0; i < cards.length; i++) {
            if (!visited[i]) {
                int count = playCard(i, cards);
                groupSizes.add(count);
            }
        }
        
        if (groupSizes.size() < 2) {
            return 0;
        }
        
        Collections.sort(groupSizes, Collections.reverseOrder());
        
        return groupSizes.get(0) * groupSizes.get(1);
    }
    
    private int playCard(int idx, int[] cards) {
        int count = 0;
        
        while (!visited[idx]) {
            visited[idx] = true;
            count++;
            idx = cards[idx] - 1;
        }
        
        return count;
    }
}
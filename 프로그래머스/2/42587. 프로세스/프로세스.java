/*
• 알고리즘 유형: 큐 / 구현 / 정렬
• 핵심 개념
 • (인덱스, 우선순위)를 큐에 저장
 • 우선순위를 내림차순 정렬
 • 현재 실행돼야 할 우선순위와 비교
 • 맞으면 실행, 아니면 뒤로 이동
• 시간 복잡도: O(N log N) + 큐 순회
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        for(int idx = 0; idx < priorities.length; idx++) {
            queue.offer(new int[]{idx, priorities[idx]});
        }
        
        List<Integer> sortedPriorities = new ArrayList<>();
        for(int num: priorities) {
            sortedPriorities.add(num);
        }
        
        sortedPriorities.sort(Collections.reverseOrder());
        
        int answer = 0;
        int idx = 0;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            
            if(current[1] == sortedPriorities.get(idx)) {
                answer++;
                
                if(current[0] == location) return answer;
                
                idx++;
            } else {
                queue.offer(current);
            }
        }
        
        return answer;
    }
}
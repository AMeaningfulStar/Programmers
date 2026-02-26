/*
알고리즘: 스택 시뮬레이션(선형 처리)
핵심 개념:
• 현재 값과 “스택의 top(마지막 값)”을 비교
• 같으면 pop(제거), 다르면 push(추가)
• ArrayList를 스택처럼 사용:
• push: add(x)
• pop: remove(size-1)
• top 조회: get(size-1)
시간 복잡도: O(N) (각 원소는 최대 1번 push되고 1번 pop됨)
공간 복잡도: O(N) (최악의 경우 모두 push)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for (int x : arr) {
            if (stk.isEmpty()) {
                stk.add(x);
            } else {
                int last = stk.get(stk.size() - 1);
                if (last == x) {
                    stk.remove(stk.size() - 1); // pop
                } else {
                    stk.add(x); // push
                }
            }
        }
        
        if(stk.size() == 0) return new int[]{-1};
        
        int[] answer = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++) {
            answer[i] = stk.get(i);
        }
        return answer;
    }
}
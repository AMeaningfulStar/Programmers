/*
알고리즘: 스택 시뮬레이션(단조 스택 형태의 반복 처리)
핵심 개념:
• stk를 스택(top=마지막 원소) 으로 사용
• arr[i]를 처리할 때:
  • top < arr[i]면 push하고 i 증가
  • 아니면 pop하고 i 유지(같은 arr[i]를 다시 비교)
• 스택의 비교/삭제는 항상 stk.size()-1 인덱스로 수행
시간 복잡도: O(N) (각 원소는 최대 1번 push, 최대 1번 pop 되므로 총 연산이 선형)
공간 복잡도: O(N) (최악의 경우 스택에 N개 저장)
*/
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                int top = stk.get(stk.size() - 1);
                if (top < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(stk.size() - 1);
                }
            }
        }

        int[] answer = new int[stk.size()];
        for (int idx = 0; idx < stk.size(); idx++) {
            answer[idx] = stk.get(idx);
        }
        return answer;
    }
}
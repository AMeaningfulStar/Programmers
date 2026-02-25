/*
알고리즘: 시뮬레이션(순차 명령 실행)
핵심 개념:
• 결과를 “스택”처럼 사용: 추가는 push, 삭제는 pop(끝에서 제거)
• flag[i]에 따라 연산 종류가 결정됨
• ArrayList의 끝 원소 삭제는 빠르며, 반복 횟수만큼 수행
• 최종적으로 리스트를 배열로 변환
시간 복잡도: O(T) (T = Σ(2*arr[i] for flag=true) + Σ(arr[i] for flag=false); 수행한 add/remove 총 횟수)
공간 복잡도: O(S) (S = 최종 리스트 크기, 중간 최대 크기 포함)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (flag[i]) {
                for (int k = 0; k < 2 * x; k++) stack.add(x);
            } else {
                for (int k = 0; k < x; k++) stack.remove(stack.size() - 1);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) answer[i] = stack.get(i);
        return answer;
    }
}
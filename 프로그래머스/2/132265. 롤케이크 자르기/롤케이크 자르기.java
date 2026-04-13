/*
• 알고리즘 유형: 해시 / 투포인터 느낌 / 누적
• 핵심 개념
 • 왼쪽: Set
 • 오른쪽: Map (개수 관리)
 • 한 번 순회하면서 상태 갱신
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> right = new HashMap<>();
        Set<Integer> left = new HashSet<>();

        // 오른쪽 전체 카운트
        for (int t : topping) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }

        for (int i = 0; i < topping.length - 1; i++) {
            int t = topping[i];

            // 왼쪽에 추가
            left.add(t);

            // 오른쪽에서 제거
            right.put(t, right.get(t) - 1);
            if (right.get(t) == 0) {
                right.remove(t);
            }

            // 종류 수 비교
            if (left.size() == right.size()) {
                answer++;
            }
        }

        return answer;
    }
}
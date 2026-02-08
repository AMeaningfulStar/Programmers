/*
알고리즘: 반복 시뮬레이션 (조건 분기 기반 선형 반복)
핵심 개념:
• 콜라츠 수열 규칙(짝수/홀수 분기)
• 종료 조건이 있는 while 루프
• 결과 길이를 알 수 없을 때 List 사용
• List → int[] 변환 패턴
시간 복잡도: O(K) (K = 콜라츠 수열의 길이, 입력값에 따라 달라짐)
공간 복잡도: O(K) (수열을 저장하는 리스트)
*/

import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
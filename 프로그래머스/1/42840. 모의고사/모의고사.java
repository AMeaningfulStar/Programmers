/*
• 알고리즘 유형: 완전탐색
• 핵심 개념 목록
 • 반복 패턴 배열
 • % 연산으로 반복 인덱스 처리
 • 맞은 개수 카운트
 • 최대값 찾기
 • 최대값과 같은 사람들 반환
• 시간 복잡도: O(N)
• 공간 복잡도: O(1) 또는 O(N) 반환 배열 제외 시 거의 상수
*/

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] sam = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] count = new int[3];
        
        // 1. 각 수포자가 몇 개 맞췄는지 계산
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < sam.length; j++) {
                if (answers[i] == sam[j][i % sam[j].length]) {
                    count[j]++;
                }
            }
        }
        
        // 2. 최고 점수 찾기
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        
        // 3. 최고 점수를 받은 사람들 찾기
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                list.add(i + 1); // 사람 번호는 1번부터
            }
        }
        
        // 4. List -> int[] 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
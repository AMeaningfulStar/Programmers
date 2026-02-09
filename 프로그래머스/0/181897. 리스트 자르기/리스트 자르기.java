/*
알고리즘: 조건 분기 + 부분 배열 추출(슬라이싱)
핵심 개념:
• n에 따라 슬라이싱 규칙이 달라지는 케이스 분기(switch-case)
• Arrays.copyOfRange(start, end)에서 end는 미포함이라 b+1 처리 필요
• n=4는 등차 간격(c)으로 인덱스를 점프하며 원소를 추출
• 결과 길이 계산: ((b-a)/c) + 1
시간 복잡도:
• n=1~3: O(L) (복사되는 구간 길이)
• n=4: O(K) (추출되는 원소 개수)
공간 복잡도: O(결과 길이) (반환 배열)
*/

import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n) {
            case 1:
                // 0 ~ b (b 포함) => copyOfRange의 end는 미포함이므로 b+1
                return Arrays.copyOfRange(num_list, 0, b + 1);

            case 2:
                // a ~ 끝
                return Arrays.copyOfRange(num_list, a, num_list.length);

            case 3:
                // a ~ b (b 포함)
                return Arrays.copyOfRange(num_list, a, b + 1);

            case 4:
                // a ~ b 까지 c 간격
                int len = (b - a) / c + 1;   // 포함 범위에서 개수 계산
                int[] answer = new int[len];
                int idx = 0;
                for (int i = a; i <= b; i += c) {
                    answer[idx++] = num_list[i];
                }
                return answer;

            default:
                // 문제에서 n은 1~4 보장되지만, 안전하게
                return new int[0];
        }
    }
}
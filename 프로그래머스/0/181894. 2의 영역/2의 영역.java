/*
알고리즘: 선형 탐색(Linear Scan) + 구간 추출
핵심 개념:
• 배열을 순회하며 조건(arr[i] == 2)을 만족하는 위치 탐색
• 첫 위치(start)는 최초 발견 시 고정
• 마지막 위치(end)는 발견할 때마다 갱신
• 구간 추출은 Arrays.copyOfRange(start, end+1) (끝 인덱스 미포함 보정)
• 값이 없을 때의 예외 처리: [-1]
시간 복잡도: O(N)
공간 복잡도: O(L) (L = end - start + 1, 반환 배열 크기)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i; // 첫 2
                end = i;                    // 마지막 2는 계속 갱신
            }
        }

        if (start == -1) return new int[]{-1}; // 2가 없음
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) { start = i; break; }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) { end = i; break; }
        }

        if (start == -1) return new int[]{-1};
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
*/
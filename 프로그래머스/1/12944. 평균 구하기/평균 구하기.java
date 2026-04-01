/*
• 알고리즘: 단순 수학 / 배열 순회
• 핵심 개념
 • 합계 구하기
 • 평균 계산
 • 형변환 타이밍
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public double solution(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }
}

/*
다른 풀이
1.
class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr)
                     .asLongStream()
                     .sum() / (double) arr.length;
    }
}

2.
class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
*/
/*
알고리즘: 빈도수 기반 케이스 분기(카운팅 → 패턴 판별 → 공식 적용)
핵심 개념:
• HashMap으로 값의 등장 횟수(count) 집계
• map.size()로 중복 패턴(1/2/3/4개의 서로 다른 값) 1차 분류
• 등장 횟수(4, 3+1, 2+2, 2+1+1, 1+1+1+1)에 따른 값(p,q,r) 추출
• 문제에서 주어진 점수 공식을 케이스별로 적용
시간 복잡도: O(1) (항상 4개 원소만 처리)
공간 복잡도: O(1) (최대 4개의 키만 저장)
*/

import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> cnt = new HashMap<>();
        cnt.put(a, cnt.getOrDefault(a, 0) + 1);
        cnt.put(b, cnt.getOrDefault(b, 0) + 1);
        cnt.put(c, cnt.getOrDefault(c, 0) + 1);
        cnt.put(d, cnt.getOrDefault(d, 0) + 1);

        // 1) 4개 동일
        if (cnt.size() == 1) {
            int p = a; // a=b=c=d
            return 1111 * p;
        }

        // 2) 3개 동일 + 1개
        if (cnt.size() == 2) {
            int p = 0, q = 0;
            for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
                if (e.getValue() == 3) p = e.getKey();
                else q = e.getKey(); // value == 1
            }
            if (p != 0 || cnt.getOrDefault(0, 0) == 3) { // p가 0일 수도 있어 안전 처리
                int val = 10 * p + q;
                return val * val;
            }

            // 3) 2개 + 2개 (p p q q)
            // size==2인데 3+1이 아니면 무조건 2+2
            Iterator<Integer> it = cnt.keySet().iterator();
            int x = it.next();
            int y = it.next();
            return (x + y) * Math.abs(x - y);
        }

        // 4) 2개 동일 + 1개 + 1개
        if (cnt.size() == 3) {
            int pair = 0;
            int prod = 1;
            for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
                if (e.getValue() == 2) pair = e.getKey();
                else prod *= e.getKey(); // value == 1인 두 값 곱
            }
            return prod;
        }

        // 5) 전부 다름
        int min = Integer.MAX_VALUE;
        for (int x : new int[]{a, b, c, d}) {
            min = Math.min(min, x);
        }
        return min;
    }
}
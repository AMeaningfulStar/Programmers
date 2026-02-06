/*
알고리즘: 선형 순회(각 쿼리마다 구간 순회)
핵심 개념:
• 쿼리 [s, e, k]의 s~e 구간 인덱스 범위 처리
• 조건 필터링: arr[i] > k
• 최소값 갱신 패턴: min = Math.min(min, arr[i])
• “없으면 -1” 처리: sentinel(Integer.MAX_VALUE) 사용
시간 복잡도: O(Q * N) (정확히는 O(∑(e-s+1)))
공간 복잡도: O(Q) (정답 배열) / 추가 작업공간 O(1)
*/

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int t = 0; t < queries.length; t++) {
            int s = queries[t][0];
            int e = queries[t][1];
            int k = queries[t][2];

            int min = Integer.MAX_VALUE;

            for (int i = s; i <= e; i++) {
                int val = arr[i];
                if (val > k) {
                    min = Math.min(min, val);
                }
            }

            answer[t] = (min == Integer.MAX_VALUE) ? -1 : min;
        }

        return answer;
    }
}
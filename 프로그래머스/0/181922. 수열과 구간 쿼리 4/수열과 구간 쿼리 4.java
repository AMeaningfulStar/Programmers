/*
알고리즘: 이중 루프 기반 선형 순회(쿼리마다 구간 순회)
핵심 개념:
• 쿼리 [s, e, k]의 구간 인덱스 처리
• 조건 필터링: i % k == 0 (인덱스가 k의 배수인지)
• 배열 원소의 in-place 업데이트 (arr[i]++)
시간 복잡도: O(∑(e - s + 1)) ≈ 최악 O(Q * N)
공간 복잡도: O(1) (추가 배열 없이 입력 배열을 직접 갱신)
*/
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int t = 0; t < queries.length; t++) {
            int s = queries[t][0];
            int e = queries[t][1];
            int k = queries[t][2];
            
            for(int idx = s; idx <= e; idx++) {
                if(idx % k == 0) {
                    arr[idx] += 1;
                }
            }
        }
        
        
        return arr;
    }
}

/*
더 간결한 풀이 코드
1.
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int s = q[0], e = q[1], k = q[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0) arr[i]++;
            }
        }
        return arr;
    }
}

2.
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int s = q[0], e = q[1], k = q[2];

            int start = (s % k == 0) ? s : s + (k - s % k);
            for (int i = start; i <= e; i += k) {
                arr[i]++;
            }
        }
        return arr;
    }
}
*/
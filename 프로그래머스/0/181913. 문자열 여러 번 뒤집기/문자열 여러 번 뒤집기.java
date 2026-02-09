/*
알고리즘: 쿼리 시뮬레이션(구간 뒤집기 반복)
핵심 개념:
• 쿼리 [s, e]를 순서대로 누적 적용
• (substring 방식) prefix/mid/suffix로 분해 후 mid reverse
• (권장) char[]로 변환 후 투 포인터 swap으로 구간 뒤집기
시간 복잡도:
• substring 방식: O(Q * N) (쿼리마다 문자열 재구성 비용이 큼)
• char[] swap 방식: O(∑(e-s+1)) (각 쿼리 구간 길이만큼)
공간 복잡도:
• substring 방식: O(N) 이상(쿼리마다 임시 문자열 생성)
• char[] swap 방식: O(N) (char 배열 1개)
*/

class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] q : queries) {
            int s = q[0], e = q[1];

            StringBuilder sb = new StringBuilder();
            sb.append(my_string, 0, s); // prefix

            String mid = my_string.substring(s, e + 1);
            sb.append(new StringBuilder(mid).reverse()); // reversed mid

            sb.append(my_string.substring(e + 1)); // suffix

            my_string = sb.toString();
        }

        return my_string;
    }
}

/*
다른 풀이
class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] chars = my_string.toCharArray();

        for (int[] q : queries) {
            int s = q[0], e = q[1];

            while (s < e) {
                char tmp = chars[s];
                chars[s] = chars[e];
                chars[e] = tmp;
                s++;
                e--;
            }
        }

        return new String(chars);
    }
}
*/
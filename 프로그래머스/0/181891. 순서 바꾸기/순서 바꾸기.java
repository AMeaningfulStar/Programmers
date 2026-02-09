/*
알고리즘: 배열 회전(Array Rotation) / 슬라이싱 후 재조합
핵심 개념:
• 배열을 두 구간 [n..end], [0..n-1]로 분리
• 순서를 바꿔 새 배열에 채움
• 인덱스 관리가 핵심(특히 오프바이원 오류 주의)
시간 복잡도: O(N) (배열 전체를 한 번씩 이동)
공간 복잡도: O(N) (결과 배열)
*/

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];

        int idx = 0;

        // 1️⃣ n부터 끝까지
        for (int i = n; i < len; i++) {
            answer[idx++] = num_list[i];
        }

        // 2️⃣ 0부터 n-1까지
        for (int i = 0; i < n; i++) {
            answer[idx++] = num_list[i];
        }

        return answer;
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        System.arraycopy(num_list, n, answer, 0, num_list.length - n);
        System.arraycopy(num_list, 0, answer, num_list.length - n, n);

        return answer;
    }
}
*/
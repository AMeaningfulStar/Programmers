class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];

        // 원본 복사
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }

        int prev = num_list[len - 2];
        int last = num_list[len - 1];

        // 마지막 값 추가
        answer[len] = (prev < last) ? (last - prev) : (last * 2);

        return answer;
    }
}

/*
더 간결한 풀이 코드
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = Arrays.copyOf(num_list, len + 1);

        int prev = num_list[len - 2];
        int last = num_list[len - 1];

        answer[len] = (prev < last) ? (last - prev) : (last * 2);
        return answer;
    }
}
*/
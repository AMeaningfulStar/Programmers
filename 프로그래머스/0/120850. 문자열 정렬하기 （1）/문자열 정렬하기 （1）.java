/*
• 알고리즘: 문자열 필터링 + 정렬 (Filtering & Sorting)
• 핵심 개념
 • 숫자 추출 ('0' ~ '9')
 • 문자 → 숫자 변환 (c - '0')
 • 정렬 (Arrays.sort)
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        return my_string.chars()
                        .filter(c -> c >= '0' && c <= '9')
                        .map(c -> c - '0')
                        .sorted()
                        .toArray();
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for(char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                sb.append(c);
            }
        }

        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);

        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i] - '0';
        }

        return answer;
    }
}
*/
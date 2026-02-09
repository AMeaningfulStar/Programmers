/*
알고리즘: 마킹 후 선형 순회(필터링)
핵심 개념:
• 삭제할 인덱스를 빠르게 확인하기 위한 존재 여부 마킹
• boolean[] remove를 이용해 O(1)로 “삭제 대상인지” 판단
• 문자열을 한 번 순회하며 삭제 대상이 아닌 문자만 누적
• 문자열 누적은 StringBuilder 사용
시간 복잡도: O(N + M) (N = my_string.length(), M = indices.length)
공간 복잡도: O(N) (remove 배열)
*/

class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] remove = new boolean[my_string.length()];
        for (int idx : indices) {
            remove[idx] = true;
        }

        StringBuilder sb = new StringBuilder(my_string.length() - indices.length);
        for (int i = 0; i < my_string.length(); i++) {
            if (!remove[i]) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}

/*
HashSet 버전 풀이

import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        Set<Integer> set = new HashSet<>();
        for (int idx : indices) set.add(idx);

        StringBuilder sb = new StringBuilder(my_string.length() - indices.length);
        for (int i = 0; i < my_string.length(); i++) {
            if (!set.contains(i)) sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}
*/

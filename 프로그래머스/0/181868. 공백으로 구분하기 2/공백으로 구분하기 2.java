/*
알고리즘: 선형 스캔 기반 토큰화(Tokenization)
핵심 개념:
• 문자열을 왼쪽부터 한 글자씩 순회하며 단어 경계(공백)를 감지
• 단어 시작 인덱스(split_idx)를 저장했다가 공백에서 substring으로 단어 확정
• 연속 공백은 split_idx == -1 상태로 자연스럽게 무시
• 마지막 글자까지 순회 후 남은 단어 후처리
• 결과 수집은 가변 길이이므로 ArrayList 사용 후 배열 변환
시간 복잡도: O(N) (N = my_string.length())
공간 복잡도: O(K) (K = 단어 개수, 반환 배열/리스트)
*/

import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        int split_idx = -1; // 단어 시작 인덱스(없으면 -1)

        for (int idx = 0; idx < my_string.length(); idx++) {
            char c = my_string.charAt(idx);

            if (c != ' ') {
                // 단어 시작을 처음 만났을 때만 시작점 기록
                if (split_idx == -1) split_idx = idx;
            } else {
                // 공백을 만났고, 단어를 만들고 있었으면 단어 확정
                if (split_idx != -1) {
                    list.add(my_string.substring(split_idx, idx));
                    split_idx = -1;
                }
                // split_idx == -1이면 연속 공백이므로 무시
            }
        }

        // 문자열 끝에서 단어가 끝나지 않은 경우 처리
        if (split_idx != -1) {
            list.add(my_string.substring(split_idx));
        }

        return list.toArray(new String[0]);
    }
}
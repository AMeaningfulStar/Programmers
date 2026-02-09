/*
알고리즘: 접미사 생성 + 정렬
핵심 개념:
• 접미사(suffix)의 정의: my_string[i..end]
• substring(i)를 이용한 접미사 생성
• 문자열의 사전순 비교 규칙
• 표준 정렬(Arrays.sort) 사용
시간 복잡도:
• 접미사 생성: O(N²) (substring이 길이 O(N)이고, N번 수행)
• 정렬: O(N log N × 비교 비용) (문자열 비교는 최악 O(N))
• 전체적으로는 O(N² log N) 수준
공간 복잡도: O(N²) (모든 접미사를 문자열로 저장)
*/

import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int idx = 0; idx < answer.length; idx++) {
            answer[idx] = my_string.substring(idx);
        }
        
        Arrays.sort(answer);
        
        /*
        다른 풀이
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        Collections.sort(list);
        */
        
        return answer;
    }
}
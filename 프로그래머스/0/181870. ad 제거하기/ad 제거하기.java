/*
알고리즘: 선형 순회 + 문자열 포함 검사 + 필터링
핵심 개념:
• 각 문자열에 대해 contains("ad") 검사
• 조건을 만족하는 요소만 수집 (Filtering)
• 동적 크기 저장을 위해 ArrayList 사용
시간 복잡도: O(N × M) (N = 문자열 개수, M = 평균 문자열 길이)
공간 복잡도: O(N) (최대 N개의 문자열 저장 가능)
*/

import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(String str: strArr) {
            if(!str.contains("ad")){
                list.add(str);
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int idx = 0; idx < list.size(); idx++) {
            answer[idx] = list.get(idx);
        }
        
        return answer;
    }
}

/*
더 간결한 풀이
class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for (String str : strArr) {
            if (!str.contains("ad")) {
                list.add(str);
            }
        }
        
        return list.toArray(new String[0]);
    }
}
*/
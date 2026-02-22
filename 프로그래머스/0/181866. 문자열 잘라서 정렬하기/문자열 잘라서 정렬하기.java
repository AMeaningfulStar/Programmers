/*
알고리즘: 문자열 분리 → 필터링 → 정렬
핵심 개념:
• split("x")로 구분자 기준 분리
• isEmpty()로 빈 문자열 제거
• 사전순 정렬 (Collections.sort / Arrays.sort)
• 동적 수집을 위해 ArrayList 사용
시간 복잡도: O(N + K log K) (N = 문자열 길이, K = 분리된 문자열 개수)
공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for (String s : arr) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
        Collections.sort(list);
        
        return list.toArray(new String[0]);
    }
}

/*
더 간결한 풀이
import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                     .filter(s -> !s.isEmpty())
                     .sorted()
                     .toArray(String[]::new);
    }
}
*/
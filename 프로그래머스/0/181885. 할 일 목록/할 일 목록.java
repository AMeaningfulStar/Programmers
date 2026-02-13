/*
알고리즘: 선형 순회 + 조건 필터링
핵심 개념:
• 두 배열을 동일 인덱스로 동기화
• boolean 조건에 따라 요소 선택
• 가변 크기 수집을 위해 List<String> 사용
• 결과를 String[]로 변환
시간 복잡도: O(N)
공간 복잡도: O(K) (K = 완료되지 않은 항목 수)
*/

import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        int len = todo_list.length;
        
        for(int idx = 0; idx < len; idx++) {
            if(!finished[idx]) {
                list.add(todo_list[idx]);
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
더 간결한 코드
import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }

        return list.toArray(new String[0]);
    }
}
*/
/*
• 알고리즘: 선형 탐색
• 핵심 개념
 • index 찾기
 • 문자열 포맷
• 시간 복잡도: O(N)
• 공간 복잡도: O(N) (List 변환 시)
*/

import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
    }
}
*/
/*
• 알고리즘: 스택 (Stack)
• 핵심 개념
 • 최근 문자와 현재 문자 비교
 • 같으면 제거(pop)
 • 다르면 추가(push)
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(String s) {
        int len = s.length();
        char[] stack = new char[len];
        int idx = -1;
        
        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            
            if(idx != -1 && stack[idx] == c) {
                idx--;                
            } else {
                idx++;
                stack[idx] = c;
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("idx: " + idx);

        return idx < 0 ? 1 : 0;
    }
}

/*
• 알고리즘: 문자열 순회
• 핵심 개념
 • 문자 비교
 • 카운팅
 • 대소문자 통일
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') p++;
            else if (c == 'y') y++;
        }
        
        return p == y;
    }
}

/*
다른 풀이
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        return s.chars().filter(c -> c == 'p').count() ==
               s.chars().filter(c -> c == 'y').count();
    }
}
*/
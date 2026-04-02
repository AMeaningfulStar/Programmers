/*
• 알고리즘: 문자열 인덱싱
• 핵심 개념
 • 중앙 인덱스 계산
 • substring 범위 설정
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public String solution(String s) {
        int len = s.length();
        int idx = len / 2;
        
        return len % 2 == 0 
            ? s.substring(idx - 1, idx + 1) 
            : s.substring(idx, idx + 1);
    }
}

/*
다른 풀이
1.
class Solution {
    public String solution(String s) {
        int len = s.length();
        int start = (len - 1) / 2;
        int end = len / 2 + 1;
        return s.substring(start, end);
    }
}
*/
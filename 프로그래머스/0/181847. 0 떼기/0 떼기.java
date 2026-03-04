/*
알고리즘: 문자열 파싱 / 문자열 순회
핵심 개념:
• 문자열 숫자를 정수로 변환하여 앞자리 0 제거
• 또는 문자열에서 첫 non-zero 위치 탐색
시간 복잡도: O(N)
공간 복잡도: O(1)
*/

class Solution {
    public String solution(String n_str) {
        return Integer.parseInt(n_str) + "";
    }
}

/*
더 안정적인 풀이
class Solution {
    public String solution(String n_str) {
        int idx = 0;
        
        while (n_str.charAt(idx) == '0') {
            idx++;
        }
        
        return n_str.substring(idx);
    }
}
*/
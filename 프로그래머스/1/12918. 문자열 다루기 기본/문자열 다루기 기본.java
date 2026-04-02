/*
• 알고리즘: 문자열 처리
• 핵심 개념
 • 길이 조건 체크
 • 숫자 판별 (Character.isDigit)
• 시간 복잡도: O(n)
• 공간 복잡도: O(1)
*/

class Solution {
    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("[0-9]+");
    }
}

/*
다른 풀이
1.
class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        
        return true;
    }
}
*/
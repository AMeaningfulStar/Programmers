/*
• 알고리즘: 문자열 생성
• 핵심 개념
 • 패턴 반복
 • 짝/홀 처리
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(int n) {
        return n % 2 == 0 ? "수박".repeat(n / 2) : "수박".repeat(n / 2) + "수";
    }
}

/*
다른 풀이
1.
class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }
        
        return sb.toString();
    }
}

2.
class Solution {
    public String solution(int n) {
        return "수박".repeat(n).substring(0, n);
    }
}
*/
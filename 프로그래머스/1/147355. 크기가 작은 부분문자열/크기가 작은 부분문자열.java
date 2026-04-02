/*
• 알고리즘: 문자열 슬라이딩 윈도우
• 핵심 개념
 • substring으로 부분 문자열 생성
 • 문자열 비교 (compareTo)
 • 길이 동일 → 사전순 비교 가능
• 시간 복잡도: O(N × M)
• 공간 복잡도: O(M)
*/

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        for (int i = 0; i <= t.length() - len; i++) {
            String sub = t.substring(i, i + len);
            
            if (sub.compareTo(p) <= 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
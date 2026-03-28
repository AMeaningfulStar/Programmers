/*
• 알고리즘: 문자열 파싱 + 조건 검증
• 핵심 개념
 • split으로 토큰 분리
 • 숫자 변환 (parseInt)
 • 연산 처리
 • 조건 비교
• 시간 복잡도: O(N × 문자열 길이)
• 공간 복잡도: O(N)
*/

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" ");
            
            int X = Integer.parseInt(parts[0]);
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);
            String oper = parts[1];
            
            int result = oper.equals("+") ? X + Y : X - Y;
            
            answer[i] = result == Z ? "O" : "X";
        }
        
        return answer;
    }
}
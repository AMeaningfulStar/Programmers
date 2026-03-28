/*
• 알고리즘: 문자열 파싱 + 누적 합 (Parsing & Aggregation)
• 핵심 개념
 • 문자열 분리 (split)
 • 토큰 분류 (x, 숫자, 연산자)
 • 계수 누적
 • 조건별 문자열 생성
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public String solution(String polynomial) {
        int xNum = 0;
        int num = 0;
        
        for (String str : polynomial.split(" ")) {
            if (str.equals("+")) continue;
            
            if (str.contains("x")) {
                if (str.equals("x")) {
                    xNum += 1;
                } else {
                    xNum += Integer.parseInt(str.replace("x", ""));
                }
            } else {
                num += Integer.parseInt(str);
            }
        }
        
        String answer = "";
        
        if (xNum > 0) {
            if (xNum == 1) answer = "x";
            else answer = xNum + "x";
        }
        
        if (num > 0) {
            if (!answer.equals("")) answer += " + ";
            answer += num;
        }
        
        return answer;
    }
}
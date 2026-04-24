/*
• 알고리즘 유형: 재귀 / 문자열 구현
• 핵심 개념
 • 가장 짧은 균형 문자열 u 분리
 • 나머지 v 재귀 처리
 • u가 올바르면 그대로 붙이기
 • 아니면 괄호 방향 변환
• 시간 복잡도: O(N²) 정도
• 공간 복잡도: 재귀 깊이 O(N)
*/

class Solution {
    public String solution(String p) {
        return convert(p);
    }
    
    private boolean isCorrect(String s) {
        int count = 0;
        
        for (char c : s.toCharArray()) {
            count += c == '(' ? 1 : -1;
            
            if (count < 0) return false;
        }
        
        return true;
    }
    
    private String convert(String p) {
        if (p.length() == 0) return "";
        
        StringBuilder u = new StringBuilder();
        int open = 0;
        int close = 0;
        int idx = 0;
        
        while (true) {
            char c = p.charAt(idx);
            
            if (c == '(') open++;
            else close++;
            
            u.append(c);
            idx++;
            
            if (open == close) break;
        }
        
        String v = p.substring(idx);
        
        if (isCorrect(u.toString())) {
            return u.toString() + convert(v);
        } else {
            StringBuilder changed = new StringBuilder();
            String uStr = u.toString();
            
            for (int i = 1; i < uStr.length() - 1; i++) {
                changed.append(uStr.charAt(i) == '(' ? ')' : '(');
            }
            
            return "(" + convert(v) + ")" + changed.toString();
        }
    }
}
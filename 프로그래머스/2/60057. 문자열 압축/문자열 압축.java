/*
• 알고리즘 유형: 문자열 / 완전탐색 / 구현
• 핵심 개념: 압축 단위별로 모든 경우 시도
• 시간 복잡도: O(N²)
• 공간 복잡도: O(N)
*/

class Solution {
    public int solution(String s) {
        int answer = s.length();
        int len = s.length();
        
        for(int unit = 1; unit <= len / 2; unit++) {
            StringBuilder result = new StringBuilder();
            
            String prev = s.substring(0, unit);
            int count = 1;
            
            for (int i = unit; i < len; i += unit) {
                int end = Math.min(i + unit, len);
                String current = s.substring(i, end);
                
                if (prev.equals(current)) {
                    count++;
                } else {
                    if (count > 1) {
                        result.append(count);
                    }
                    result.append(prev);
                    
                    prev = current;
                    count = 1;
                }
            }
            
            if (count > 1) {
                result.append(count);
            }
            result.append(prev);
            
            answer = Math.min(answer, result.length());
        }
        
        return answer;
    }
}
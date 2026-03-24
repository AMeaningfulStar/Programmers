/*
• 알고리즘: 자리수 분해 (Digit Decomposition)
• 핵심 개념
 • 문자열 변환 vs 숫자 분해
 • % 10 (자리 추출)
 • / 10 (자리 제거)
• 시간 복잡도: O(N) (자리수 기준)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for(char c : String.valueOf(order).toCharArray()) {
            if(c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order > 0) {
            int digit = order % 10;
            
            if(digit == 3 || digit == 6 || digit == 9) {
                answer++;
            }
            
            order /= 10;
        }
        
        return answer;
    }
}
*/
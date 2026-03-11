/*
알고리즘: 문자열 선형 변환 (Linear Transformation)
핵심 개념:
• 문자열 순회
• ASCII 문자 비교
• 조건에 따라 문자 치환
시간 복잡도: O(N)
공간 복잡도: O(N)
*/

class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder(myString.length());
        
        for(int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            
            if(c < 'l') {
                answer.append('l');
            } else {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}

/*
다른 풀이
class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : myString.toCharArray()) {
            sb.append((char)Math.max(c, 'l'));
        }
        
        return sb.toString();
    }
}
*/
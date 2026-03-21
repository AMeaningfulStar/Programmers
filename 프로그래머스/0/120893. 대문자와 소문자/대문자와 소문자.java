/*
• 알고리즘: 문자열 변환 (String Transformation)
• 핵심 개념
 • 문자 순회
 • 대소문자 판별 (Character.isUpperCase)
 • 문자 변환 (toLowerCase, toUpperCase)
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string.length());
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }
        }
        
        return answer.toString();
    }
}

/*
다른 풀이
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            sb.append(Character.isUpperCase(c) 
                      ? Character.toLowerCase(c) 
                      : Character.toUpperCase(c));
        }
        
        return sb.toString();
    }
}
*/
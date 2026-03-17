/*
• 알고리즘: 문자열 처리 (String Manipulation)
• 핵심 개념
 • 문자열 역순 순회
 • StringBuilder를 이용한 문자열 생성
 • charAt()을 통한 문자 접근
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string.length());
        
        for(int i = my_string.length() - 1; i >= 0; i--) {
            answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}

/*
다른 풀이
class Solution {
    public String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
}
*/
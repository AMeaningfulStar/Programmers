/*
• 알고리즘: 문자 변환 (Character Mapping)
• 핵심 개념
 • ASCII 연산
 • 문자 → 숫자 (c - '0')
 • 숫자 → 문자 (+ 'a')
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : String.valueOf(age).toCharArray()) {
            answer.append((char)(c - '0' + 'a'));
        }
        
        return answer.toString();
    }
}

/*
다른 풀이
class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        while(age > 0) {
            sb.append((char)('a' + (age % 10)));
            age /= 10;
        }
        
        return sb.reverse().toString();
    }
}
*/
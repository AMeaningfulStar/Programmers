/*
• 알고리즘: 문자열 변환 (String Transformation)
• 핵심 개념
 • 문자 순회 (toCharArray)
 • 조건 기반 변환
 • 매핑 로직 구현
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : rsp.toCharArray()) {
            if(c == '2') {
                answer.append('0');
            } else if(c == '0') {
                answer.append('5');
            } else {
                answer.append('2');
            }
        }
        
        return answer.toString();
    }
}

/*
다른 풀이
class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : rsp.toCharArray()) {
            sb.append(c == '2' ? '0' : c == '0' ? '5' : '2');
        }
        
        return sb.toString();
    }
}
*/
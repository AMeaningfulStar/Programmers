/*
• 알고리즘: 문자열 파싱 + 숫자 누적
• 핵심 개념
 • 숫자 판별 (Character.isDigit)
 • 문자열 누적 (StringBuilder)
 • 경계 처리 (마지막 숫자)
 • 정규식 분리 (split)
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder num = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                num.append(c);
            } else {
                if(num.length() > 0) {
                    answer += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }
        
        // 마지막 숫자 처리
        if(num.length() > 0) {
            answer += Integer.parseInt(num.toString());
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("[^0-9]+");
        
        for(String s : arr) {
            if(!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}
*/
/*
• 알고리즘: 문자열 처리
• 핵심 개념
 • 인덱스 조건 분기
 • 문자열 빌드
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder(phone_number.length());
        
        for(int i = 0; i < phone_number.length(); i++) {
            if(i < phone_number.length() - 4) {
                answer.append("*");
            } else {
                answer.append(phone_number.charAt(i));
            }
        }
        return answer.toString();
    }
}

/*
다른 풀이
1.
class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String stars = "*".repeat(len - 4);
        return stars + phone_number.substring(len - 4);
    }
}

2. 
class Solution {
    public String solution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
*/
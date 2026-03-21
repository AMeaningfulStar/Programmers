/*
• 알고리즘: 문자열 처리 (String Manipulation)
• 핵심 개념
 • 특정 문자 집합 제거
 • 문자열 치환 (replace, replaceAll)
 • 문자 필터링
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String my_string) {
        String answer = my_string.replace("a" ,  "")
                                 .replace("e" ,  "")
                                 .replace("i" ,  "")
                                 .replace("o" ,  "")
                                 .replace("u" ,  "");
        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}

2.
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for(char c : my_string.toCharArray()) {
            if("aeiou".indexOf(c) == -1) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
*/
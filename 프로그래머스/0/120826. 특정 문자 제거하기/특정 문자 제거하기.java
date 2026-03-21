/*
• 알고리즘: 문자열 처리 (String Manipulation)
• 핵심 개념
 • 특정 문자열 치환 (replace)
 • 문자열 탐색 및 제거
 • 불필요 문자 필터링
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}

/*
다른 풀이
class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();

        for(char c : my_string.toCharArray()) {
            if(!String.valueOf(c).equals(letter)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
*/
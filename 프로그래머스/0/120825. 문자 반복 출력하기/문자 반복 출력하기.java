/*
• 알고리즘: 문자열 생성 + 반복 (String Construction & Repetition)
• 핵심 개념
 • 문자열 순회 (toCharArray())
 • 문자 반복
 • StringBuilder 활용 (성능 최적화)
• 시간 복잡도: O(N × n)
• 공간 복잡도: O(N × n)
*/

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(char c: my_string.toCharArray()) {
            for(int i = 0; i < n; i++){
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}

/*
다른 풀이
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int n) {
        return my_string.chars()
                        .mapToObj(c -> String.valueOf((char)c).repeat(n))
                        .collect(Collectors.joining());
    }
}
*/
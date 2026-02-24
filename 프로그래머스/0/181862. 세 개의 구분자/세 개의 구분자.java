/*
알고리즘: 선형 스캔 기반 토큰화(Tokenization) + 구분자 처리
핵심 개념:
• 구분자 집합: {a, b, c}
• 문자를 왼쪽부터 순회하며 구분자를 만나면 현재 토큰을 확정
• 연속 구분자는 빈 토큰을 만들지만 문제 조건상 제외
• 토큰이 하나도 없으면 예외 처리로 ["EMPTY"] 반환
• 가변 길이 결과 수집을 위해 ArrayList 사용
시간 복잡도: O(N)
공간 복잡도: O(N) (토큰/반환 문자열 저장)
*/

/*
내 풀이
import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        String str = "";

        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);

            if (c != 'a' && c != 'b' && c != 'c') {
                str += c;
            } else {
                if (str.length() > 0) {
                    list.add(str);
                    str = "";
                }
            }
        }

        if (str.length() > 0) list.add(str);

        if (list.size() == 0) {
            return new String[] {"EMPTY"};
        }

        String[] answer = new String[list.size()];
        for (int idx = 0; idx < list.size(); idx++) {
            answer[idx] = list.get(idx);
        }
        return answer;
    }
}
*/

// 더 나은 풀이
import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);

            if (c != 'a' && c != 'b' && c != 'c') {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }

        if (sb.length() > 0) list.add(sb.toString());

        if (list.isEmpty()) return new String[] {"EMPTY"};
        return list.toArray(new String[0]);
    }
}
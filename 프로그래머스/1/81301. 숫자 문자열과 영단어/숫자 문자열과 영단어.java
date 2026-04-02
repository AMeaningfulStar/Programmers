/*
• 알고리즘: 문자열 치환 또는 문자열 파싱
• 핵심 개념
 • 영단어 → 숫자 매핑
 • 문자열 누적 후 완성 여부 검사
 • replace를 이용한 직접 치환
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    private Map<String, Integer> alphabetMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        return map;
    }

    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        Map<String, Integer> alphabet = alphabetMap();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                word.append(c);

                String current = word.toString();
                if (alphabet.containsKey(current)) {
                    sb.append(alphabet.get(current));
                    word.setLength(0);
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(String s) {
        s = s.replace("zero", "0")
             .replace("one", "1")
             .replace("two", "2")
             .replace("three", "3")
             .replace("four", "4")
             .replace("five", "5")
             .replace("six", "6")
             .replace("seven", "7")
             .replace("eight", "8")
             .replace("nine", "9");

        return Integer.parseInt(s);
    }
}
*/
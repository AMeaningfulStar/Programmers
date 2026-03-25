/*
• 알고리즘: 문자열 파싱 + 해시맵 조회
• 핵심 개념
 • 문자열 분리 (split)
 • Map 조회 O(1)
 • 문자열 누적 (StringBuilder)
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String solution(String letter) {
        Map<String, String> morse = getMorseMap();
        StringBuilder answer = new StringBuilder();
        
        for(String let : letter.split(" ")) {
            answer.append(morse.get(let));
        }
        
        return answer.toString();
    }
    
    public Map<String, String> getMorseMap() {
        Map<String, String> morse = new HashMap<>();
        
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
        
        return morse;
    }
}

/*
다른 풀이
class Solution {
    private static final Map<String, String> MORSE = Map.ofEntries(
        Map.entry(".-", "a"), Map.entry("-...", "b"), Map.entry("-.-.", "c"),
        Map.entry("-..", "d"), Map.entry(".", "e"), Map.entry("..-.", "f"),
        Map.entry("--.", "g"), Map.entry("....", "h"), Map.entry("..", "i"),
        Map.entry(".---", "j"), Map.entry("-.-", "k"), Map.entry(".-..", "l"),
        Map.entry("--", "m"), Map.entry("-.", "n"), Map.entry("---", "o"),
        Map.entry(".--.", "p"), Map.entry("--.-", "q"), Map.entry(".-.", "r"),
        Map.entry("...", "s"), Map.entry("-", "t"), Map.entry("..-", "u"),
        Map.entry("...-", "v"), Map.entry(".--", "w"), Map.entry("-..-", "x"),
        Map.entry("-.--", "y"), Map.entry("--..", "z")
    );

    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        
        for(String s : letter.split(" ")) {
            sb.append(MORSE.get(s));
        }
        
        return sb.toString();
    }
}
*/
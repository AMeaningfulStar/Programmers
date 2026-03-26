/*
(현재 풀이)
• 알고리즘: 문자열 파싱 (Streaming Parsing)
• 핵심 개념
 • 문자 누적
 • 패턴 매칭 (switch)
 • 문자열 초기화 (setLength(0))
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)

(replace 방식)
• 알고리즘: 문자열 치환 (String Replacement)
• 핵심 개념
 • 패턴 치환
 • 체이닝 replace
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public long solution(String numbers) {
        StringBuilder answer = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        for (char c : numbers.toCharArray()) {
            word.append(c);
            
            switch (word.toString()) {
                case "zero" -> {
                    answer.append("0");
                    word.setLength(0);
                }
                case "one" -> {
                    answer.append("1");
                    word.setLength(0);
                }
                case "two" -> {
                    answer.append("2");
                    word.setLength(0);
                }
                case "three" -> {
                    answer.append("3");
                    word.setLength(0);
                }
                case "four" -> {
                    answer.append("4");
                    word.setLength(0);
                }
                case "five" -> {
                    answer.append("5");
                    word.setLength(0);
                }
                case "six" -> {
                    answer.append("6");
                    word.setLength(0);
                }
                case "seven" -> {
                    answer.append("7");
                    word.setLength(0);
                }
                case "eight" -> {
                    answer.append("8");
                    word.setLength(0);
                }
                case "nine" -> {
                    answer.append("9");
                    word.setLength(0);
                }
            }
        }
        
        return Long.parseLong(answer.toString());
    }
}

/*
다른 풀이
class Solution {
    public long solution(String numbers) {
        numbers = numbers.replace("zero", "0")
                         .replace("one", "1")
                         .replace("two", "2")
                         .replace("three", "3")
                         .replace("four", "4")
                         .replace("five", "5")
                         .replace("six", "6")
                         .replace("seven", "7")
                         .replace("eight", "8")
                         .replace("nine", "9");
        
        return Long.parseLong(numbers);
    }
}
*/
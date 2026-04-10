/*
• 알고리즘 유형: 문자열 / 구현
• 핵심 개념
 • 정규식 필터링
 • 반복 치환
 • 앞/뒤 문자 제거
 • 길이 조건 보정
• 시간 복잡도: O(N) 수준
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        new_id = new_id.replaceAll("[^0-9a-z-_.]", "");

        // 3단계
        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }

        // 4단계
        if (new_id.length() > 0 && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        if (new_id.length() > 0 && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 5단계
        if (new_id.length() == 0) {
            new_id = "a";
        }

        // 6단계
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 7단계
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }
}
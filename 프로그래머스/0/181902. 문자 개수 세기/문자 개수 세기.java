/*
알고리즘: 선형 순회 + 빈도 카운팅
핵심 개념:
• 문자열을 한 글자씩 순회
• ASCII 코드(문자 코드)를 이용한 인덱스 매핑
• 대문자와 소문자를 서로 다른 구간(025 / 2651)에 카운트
• 고정 크기 배열을 이용한 빈도수 저장
시간 복잡도: O(N) (N = my_string.length())
공간 복잡도: O(1) (항상 크기 52의 배열만 사용)
*/

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                answer[c - 'a' + 26]++;
            }
        }

        return answer;
    }
}
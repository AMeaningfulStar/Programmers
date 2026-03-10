/*
알고리즘: 이중 확장 시뮬레이션
핵심 개념:
• 각 행(row)을 순회
• 각 문자(char)를 k번 반복해서 가로 확대
• 완성된 문자열을 k번 넣어서 세로 확대
• 문자열 누적은 StringBuilder 사용
시간 복잡도: O(R × C × k) (R = picture.length, C = 한 줄 길이)
공간 복잡도: O(R × C × k) (확대된 결과 저장)
*/

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;

        for (String str : picture) {
            StringBuilder sb = new StringBuilder();

            // 가로 확대
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                for (int c = 0; c < k; c++) {
                    sb.append(ch);
                }
            }

            String expanded = sb.toString();

            // 세로 확대
            for (int p = 0; p < k; p++) {
                answer[idx++] = expanded;
            }
        }

        return answer;
    }
}
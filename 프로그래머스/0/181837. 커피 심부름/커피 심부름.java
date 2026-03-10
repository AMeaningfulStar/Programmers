/*
알고리즘: 선형 순회 + 조건 분기
핵심 개념
• 문자열 패턴 검사 (contains)
• 조건에 따라 다른 값 누적
시간 복잡도: O(N × M)
• N = 주문 개수
• M = 문자열 길이
공간 복잡도: O(1)
*/

class Solution {
    public int solution(String[] order) {
        int answer = 0;

        for(String menu : order) {
            if(menu.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }

        return answer;
    }
}
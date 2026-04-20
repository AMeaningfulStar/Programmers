/*
• 알고리즘 유형: 그리디
• 핵심 개념
 • 자릿수별 최소 이동 선택
 • 올림/내림 결정
 • carry(올림)가 다음 자리 영향
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while (storey > 0) {
            int digit = storey % 10;
            int next = (storey / 10) % 10;
            
            if (digit > 5) {
                answer += 10 - digit;
                storey = storey / 10 + 1;
            } 
            else if (digit < 5) {
                answer += digit;
                storey /= 10;
            } 
            else { // digit == 5
                if (next >= 5) {
                    answer += 5;
                    storey = storey / 10 + 1;
                } else {
                    answer += 5;
                    storey /= 10;
                }
            }
        }
        
        return answer;
    }
}
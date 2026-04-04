/*
• 알고리즘 유형: 구현 / 수학 / 누적합
• 핵심 개념
 • 기준 날짜 설정 (2016-01-01 = FRI)
 • 이전 날짜 누적
 • 요일은 7로 순환
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public String solution(int a, int b) {
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int count = 0;
        
        for(int i = 0; i < a; i++) {
            count += days[i];
        }
        
        count += b - 1;

        return day[count % 7];
    }
}
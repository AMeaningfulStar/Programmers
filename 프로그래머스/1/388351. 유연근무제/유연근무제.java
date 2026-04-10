/*
• 알고리즘 유형: 구현 / 시뮬레이션
• 핵심 개념
 • HHMM → 분 변환
 • 10분 더한 인정 시각 계산
 • 시작 요일 기준으로 7일의 실제 요일 계산
 • 토/일 제외 후 비교
• 시간 복잡도: O(n × 7) = O(n)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            boolean isSuccess = true;

            int limitTime = toMinutes(schedules[i]) + 10;

            for (int j = 0; j < 7; j++) {
                int day = (startday + j - 1) % 7 + 1;

                if (day == 6 || day == 7) continue;

                int logTime = toMinutes(timelogs[i][j]);

                if (logTime > limitTime) {
                    isSuccess = false;
                    break;
                }
            }

            if (isSuccess) answer++;
        }

        return answer;
    }

    private int toMinutes(int time) {
        int hour = time / 100;
        int minute = time % 100;
        return hour * 60 + minute;
    }
}
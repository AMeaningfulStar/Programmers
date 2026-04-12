/*
• 알고리즘 유형: 구현 / 시뮬레이션
• 핵심 개념
 • 시간을 초 단위로 변환
 • prev / next 명령 처리
 • 오프닝 구간이면 자동으로 op_end 이동
 • 시작 전 / 명령 후 모두 보정
• 시간 복잡도: O(commands.length)
• 공간 복잡도: O(1)
*/

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int vLen = toSeconds(video_len);
        int position = toSeconds(pos);
        int opStart = toSeconds(op_start);
        int opEnd = toSeconds(op_end);

        // 시작 위치가 오프닝 구간이면 먼저 이동
        position = skipOpening(position, opStart, opEnd);

        for (String command : commands) {
            if (command.equals("prev")) {
                position = Math.max(0, position - 10);
            } else if (command.equals("next")) {
                position = Math.min(vLen, position + 10);
            }

            // 이동 후 오프닝 구간이면 다시 이동
            position = skipOpening(position, opStart, opEnd);
        }

        return toTime(position);
    }

    private int toSeconds(String time) {
        String[] arr = time.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }

    private int skipOpening(int pos, int opStart, int opEnd) {
        if (opStart <= pos && pos <= opEnd) {
            return opEnd;
        }
        return pos;
    }

    private String toTime(int time) {
        int minute = time / 60;
        int second = time % 60;
        return String.format("%02d:%02d", minute, second);
    }
}
/*
• 알고리즘: 시뮬레이션 (Simulation)
• 핵심 개념
 • 입력 명령 순차 처리
 • 좌표 이동
 • 보드 범위 경계 검사
 • 방향별 조건 분기 (switch)
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (String key : keyinput) {
            switch (key) {
                case "up" -> {
                    if (y < maxY) y++;
                }
                case "down" -> {
                    if (y > -maxY) y--;
                }
                case "left" -> {
                    if (x > -maxX) x--;
                }
                case "right" -> {
                    if (x < maxX) x++;
                }
            }
        }
        
        return new int[]{x, y};
    }
}
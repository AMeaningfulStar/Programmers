class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[][] go = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // → ↓ ← ↑

        int x = 0, y = 0, dir = 0, num = 1;

        for (int i = 0; i < n * n; i++) {
            answer[x][y] = num++;

            int nextX = x + go[dir][0];
            int nextY = y + go[dir][1];

            // 방향 전환 조건: 배열 범위를 벗어나거나, 이미 숫자가 들어간 경우
            if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n || answer[nextX][nextY] != 0) {
                dir = (dir + 1) % 4; // 방향 전환 (→ ↓ ← ↑)
                nextX = x + go[dir][0];
                nextY = y + go[dir][1];
            }

            x = nextX;
            y = nextY;
        }

        return answer;
    }
}
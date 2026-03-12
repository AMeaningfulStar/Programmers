/*
알고리즘: 시뮬레이션 + 방향 전환
핵심 개념:
• 2차원 배열을 직접 순회하며 상태를 갱신
• 방향 벡터(→ ↓ ← ↑) 사용
• 다음 칸이 범위를 벗어나거나 이미 방문한 칸이면 방향 변경
• 1부터 n²까지 정확히 한 번씩 채움
시간 복잡도: O(n²)
공간 복잡도: O(n²)
*/

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // 1. 위쪽 행
            for (int col = left; col <= right; col++) {
                answer[top][col] = num++;
            }
            top++;

            // 2. 오른쪽 열
            for (int row = top; row <= bottom; row++) {
                answer[row][right] = num++;
            }
            right--;

            // 3. 아래쪽 행
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    answer[bottom][col] = num++;
                }
                bottom--;
            }

            // 4. 왼쪽 열
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    answer[row][left] = num++;
                }
                left++;
            }
        }
        return answer;
    }
}

/*
다른 풀이
1.
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

2.
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        fill(answer, 0, n - 1, 1);
        return answer;
    }

    private void fill(int[][] arr, int start, int end, int num) {
        if (start > end) return;
        if (start == end) {
            arr[start][end] = num;
            return;
        }

        for (int j = start; j <= end; j++) arr[start][j] = num++;
        for (int i = start + 1; i <= end; i++) arr[i][end] = num++;
        for (int j = end - 1; j >= start; j--) arr[end][j] = num++;
        for (int i = end - 1; i > start; i--) arr[i][start] = num++;

        fill(arr, start + 1, end - 1, num);
    }
}
*/
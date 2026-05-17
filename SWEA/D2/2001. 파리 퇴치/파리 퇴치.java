import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] board = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    board[i][j] = sc.nextInt();
                }
            }

            int answer = 0;

            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    answer = Math.max(answer, totalValue(i, j, board, M));
                }
            }

            System.out.printf("#%d %d\n", test_case, answer);
        }
    }

    private static int totalValue(int startX, int startY, int[][] board, int M) {
        int sum = 0;

        for (int i = startX; i < startX + M; i++) {
            for (int j = startY; j < startY + M; j++) {
                sum += board[i][j];
            }
        }

        return sum;
    }
}
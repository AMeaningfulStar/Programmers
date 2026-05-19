import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int n = sc.nextInt();

            int[][] board = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = sc.nextInt();
                }
            }

            int[][] turn90 = new int[n][n];
            int[][] turn180 = new int[n][n];
            int[][] turn270 = new int[n][n];

            // 회전
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    turn90[i][j] = board[n - 1 - j][i];

                    turn180[i][j] = board[n - 1 - i][n - 1 - j];

                    turn270[i][j] = board[j][n - 1 - i];
                }
            }

            System.out.println("#" + test_case);

            for (int i = 0; i < n; i++) {

                // 90도
                for (int j = 0; j < n; j++) {
                    System.out.print(turn90[i][j]);
                }

                System.out.print(" ");

                // 180도
                for (int j = 0; j < n; j++) {
                    System.out.print(turn180[i][j]);
                }

                System.out.print(" ");

                // 270도
                for (int j = 0; j < n; j++) {
                    System.out.print(turn270[i][j]);
                }

                System.out.println();
            }
        }
    }
}
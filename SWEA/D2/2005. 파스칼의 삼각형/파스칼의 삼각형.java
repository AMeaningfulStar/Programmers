import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();

            int[][] board = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        board[i][j] = 1;
                    } else {
                        board[i][j] = board[i - 1][j - 1] + board[i - 1][j];
                    }
                }
            }

            System.out.printf("#%d\n", test_case);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[][] board = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    board[i][j] = sc.nextInt();
                }
            }

            int answer = 0;

            // 가로 확인
            for (int i = 0; i < N; i++) {
                int count = 0;

                for (int j = 0; j < N; j++) {
                    if (board[i][j] == 1) {
                        count++;
                    } else {
                        if (count == K) {
                            answer++;
                        }
                        count = 0;
                    }
                }

                if (count == K) {
                    answer++;
                }
            }

            // 세로 확인
            for (int j = 0; j < N; j++) {
                int count = 0;

                for (int i = 0; i < N; i++) {
                    if (board[i][j] == 1) {
                        count++;
                    } else {
                        if (count == K) {
                            answer++;
                        }
                        count = 0;
                    }
                }

                if (count == K) {
                    answer++;
                }
            }

            System.out.printf("#%d %d\n", test_case, answer);
        }
    }
}
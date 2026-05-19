import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int[][] sudoku = new int[9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = sc.nextInt();
                }
            }

            int answer = isValid(sudoku) ? 1 : 0;

            System.out.println("#" + test_case + " " + answer);
        }
    }

    private static boolean isValid(int[][] sudoku) {
        // 가로 검사
        for (int i = 0; i < 9; i++) {
            boolean[] check = new boolean[10];

            for (int j = 0; j < 9; j++) {
                int num = sudoku[i][j];

                if (check[num]) {
                    return false;
                }

                check[num] = true;
            }
        }

        // 세로 검사
        for (int j = 0; j < 9; j++) {
            boolean[] check = new boolean[10];

            for (int i = 0; i < 9; i++) {
                int num = sudoku[i][j];

                if (check[num]) {
                    return false;
                }

                check[num] = true;
            }
        }

        // 3x3 박스 검사
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] check = new boolean[10];

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        int num = sudoku[i][j];

                        if (check[num]) {
                            return false;
                        }

                        check[num] = true;
                    }
                }
            }
        }

        return true;
    }
}
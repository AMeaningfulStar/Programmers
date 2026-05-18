import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String[] grade = {
            "A+", "A0", "A-",
            "B+", "B0", "B-",
            "C+", "C0", "C-",
            "D0"
        };

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            double[] scores = new double[N];
            double targetScore = 0;

            for (int i = 0; i < N; i++) {
                int scoreA = sc.nextInt();
                int scoreB = sc.nextInt();
                int scoreC = sc.nextInt();

                double total = scoreA * 0.35 + scoreB * 0.45 + scoreC * 0.2;

                scores[i] = total;

                if (i + 1 == K) {
                    targetScore = total;
                }
            }

            int rank = 0;

            for (int i = 0; i < N; i++) {
                if (scores[i] > targetScore) {
                    rank++;
                }
            }

            int gradeIndex = rank / (N / 10);

            System.out.printf("#%d %s\n", test_case, grade[gradeIndex]);
        }
    }
}
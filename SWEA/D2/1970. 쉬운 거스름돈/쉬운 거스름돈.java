import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int test_case = 1; test_case <= T; test_case++) {
            int price = sc.nextInt();

            System.out.println("#" + test_case);

            for (int i = 0; i < money.length; i++) {
                int count = price / money[i];

                System.out.print(count + " ");

                price %= money[i];
            }

            System.out.println();
        }
    }
}
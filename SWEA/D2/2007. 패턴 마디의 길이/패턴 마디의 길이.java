import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.next();

            for (int len = 1; len <= 10; len++) {
                String pattern = str.substring(0, len);
                String next = str.substring(len, len * 2);

                if (pattern.equals(next)) {
                    System.out.printf("#%d %d\n", test_case, len);
                    break;
                }
            }
        }

        sc.close();
    }
}
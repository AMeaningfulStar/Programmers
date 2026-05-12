import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] lastDay = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.next();

            String year = str.substring(0, 4);
            String monthStr = str.substring(4, 6);
            String dayStr = str.substring(6, 8);

            int month = Integer.parseInt(monthStr);
            int day = Integer.parseInt(dayStr);

            String result;

            if (month < 1 || month > 12) {
                result = "-1";
            } else if (day < 1 || day > lastDay[month]) {
                result = "-1";
            } else {
                result = year + "/" + monthStr + "/" + dayStr;
            }

            System.out.printf("#%d %s%n", test_case, result);
        }
    }
}
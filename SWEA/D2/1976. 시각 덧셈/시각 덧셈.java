import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int hourA = sc.nextInt();
            int minuteA = sc.nextInt();
            int hourB = sc.nextInt();
            int minuteB = sc.nextInt();

            int minute = minuteA + minuteB;
            int hour = hourA + hourB;

            if (minute >= 60) {
                hour += 1;
                minute -= 60;
            }

            hour %= 12;

            if (hour == 0) {
                hour = 12;
            }

            System.out.println("#" + test_case + " " + hour + " " + minute);
        }
    }
}
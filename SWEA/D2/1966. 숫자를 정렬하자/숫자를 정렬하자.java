import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            StringBuilder sb = new StringBuilder();

            sb.append("#").append(test_case).append(" ");

            for (int num : arr) {
                sb.append(num).append(" ");
            }

            System.out.println(sb);
        }
    }
}
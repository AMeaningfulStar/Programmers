import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();
            
            int answer = 0;
            int result = 0;
            
            while (result <= N) {
            	result = A + B;
                answer++;
                
                if (A > B) {
                	B = result;
                } else {
                	A = result;
                }
            }

            System.out.printf("%d%n", answer);
        }
    }
}
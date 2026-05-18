import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int num = sc.nextInt();
            int answer = 1;
            
            for (int i = 2; i <= num; i++) {
            	answer = i % 2 == 0 ? answer - i : answer + i;
            }
            
            System.out.printf("#%d %d\n", test_case, answer);
		}
	}
}
import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
            boolean answer = true;
			String str = sc.next();
			int len = str.length();
            
            for (int i = 0; i < len / 2; i++) {
            	if (str.charAt(i) != str.charAt(len - 1 - i)) {
                	answer = false;
                    break;
                }
            }
            
            System.out.printf("#%d %d\n", test_case, answer ? 1 : 0);
		}
	}
}
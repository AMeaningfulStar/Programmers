import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            String result = num1 == num2 ? "=" : num1 > num2 ? ">" : "<";
            
			System.out.printf("#%d %s\n", test_case, result);
		}
	}
}
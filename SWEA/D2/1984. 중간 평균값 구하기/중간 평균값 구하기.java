import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int maxNum = 0;
            int minNum = 10000;
            int total = 0;
            
            for (int i = 0; i < 10; i++) {
            	int num = sc.nextInt();
                
                maxNum = Math.max(maxNum, num);
                minNum = Math.min(minNum, num);
                total += num;
            }
			
            total -= (maxNum + minNum);
            
			System.out.printf("#%d %d\n",
                              test_case,
                              Math.round(total / 8.0));
		}
	}
}
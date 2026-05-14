import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
        System.out.printf("1 ");
        
        int result = 1;
        
		for (int i = 1; i <= num; i++) {
            result *= 2;
			System.out.printf("%d ", result);
		}
	}
}
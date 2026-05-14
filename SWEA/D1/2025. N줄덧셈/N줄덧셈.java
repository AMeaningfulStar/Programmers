import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        
        int result = (num * (num + 1)) / 2;
        
        System.out.println(result);
	}
}
import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        
        for (char c : str.toCharArray()) {
        	System.out.printf("%d ", (int)c - 'A' + 1);
        }
	}
}
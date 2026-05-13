import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();

		for(int i = 0; i < count; i++) {
			sb.append("#");
		}
        
        System.out.println(sb.toString());
	}
}
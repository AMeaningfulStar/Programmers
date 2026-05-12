import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int answer = 0;
        
        while(num > 0) {
			answer += num % 10;
            num /= 10;
		}
        
        System.out.println(answer);
	}
}
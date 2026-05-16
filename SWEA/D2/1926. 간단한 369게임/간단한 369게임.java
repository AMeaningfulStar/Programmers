import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
        
		for (int i = 1; i <= number; i++) {
            String numStr = String.valueOf(i);
            
            int count = 0;
            
            for (int j = 0; j < numStr.length(); j++) {
            	char ch = numStr.charAt(j);
                
                if (ch == '3' || ch == '6' || ch == '9') {
                	count++;
                }
            }
            
            if (count > 0) {
                for (int j = 0;  j < count; j++) {
                    System.out.printf("-");
                }
                System.out.printf(" ");
            } else {
            	System.out.printf("%s ", numStr);
            }
		}
        
        sc.close();
	}
}
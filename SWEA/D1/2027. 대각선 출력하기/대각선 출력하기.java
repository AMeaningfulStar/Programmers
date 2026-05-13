import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
        for (int i = 0; i < 5; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < 5; j++) {
            	if (i == j) {
                	sb.append('#');
                } else {
                	sb.append('+');
                }
            }
            
            System.out.println(sb.toString());
        }
	}
}
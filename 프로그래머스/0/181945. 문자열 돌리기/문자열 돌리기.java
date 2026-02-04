import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder sb = new StringBuilder(a.length());
        
        for(int idx = 0; idx < a.length() - 1; idx++){
            char c = a.charAt(idx);
            
            /*
            sb.append((char) c + "\n");
            
            이 방법보다는 아래 방법이 좋은 방법이다. c의 자료형은 char, \n은 String이기에
            따로따로 append하는 것이 좋다.
            
            sb.append(c).append('\n');
            */
            sb.append((char) c + "\n");
            
        }
        
        sb.append((char) a.charAt(a.length() - 1));
        
        System.out.println(sb.toString());
        
        
        sc.close();
    }
}
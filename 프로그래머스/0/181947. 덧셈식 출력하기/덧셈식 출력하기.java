import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        /*
        1.
        System.out.println(a + " + " + b + " = " + (a + b));
        
        2.
        StringBuilder sb = new StringBuilder();
        
        sb.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(sb);
        
        3.
        System.out.printf("%d + %d = %d", a, b, a + b);
        */
        
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append(a + b);
        
        System.out.println(sb);
    }
}
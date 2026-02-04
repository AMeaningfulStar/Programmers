/*
알고리즘: 조건 분기 (if / else)
자료구조: StringBuilder
시간 복잡도: O(1)
공간 복잡도: O(1)
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        if(n % 2 == 1) {
            sb.append(n).append(" is odd");
        }
        else {
            sb.append(n).append(" is even");
        }
        
        /*
        1.
        sb.append(n).append(n % 2 != 0 ? " is odd" : " is even");
        
        2.
        System.out.printf("%d is %s", n, (n % 2 != 0 ? "odd" : "even"));
        */
        System.out.println(sb);
        
        sc.close();
    }
}
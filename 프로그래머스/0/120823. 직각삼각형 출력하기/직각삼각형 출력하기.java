/*
• 알고리즘: 반복문 + 출력 (Iteration & Output)
• 핵심 개념
 • 이중 반복문
 • 패턴 출력
 • 문자열 누적 후 출력
• 시간 복잡도: O(N²)
• 공간 복잡도: O(N)
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for(int line = 0; line < n; line++) {
            for(int count = 0; count < line + 1; count++) {
                sb.append("*");
            }
            
            System.out.println(sb.toString());
            
            sb.setLength(0);
        }
        
        /*
        다른 풀이
        1.
        for(int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
        
        2.
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        sc.close();
    }
}
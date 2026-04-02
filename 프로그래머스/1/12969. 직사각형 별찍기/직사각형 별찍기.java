/*
• 알고리즘: 반복문
• 핵심 개념
 • 문자열 생성 비용
 • String vs StringBuilder
• 시간 복잡도: O(n × m)
• 공간 복잡도: O(n)
*/

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = 0; i < m; i++) {
            String star = "";
            
            for(int j = 0; j < n; j++) {
                star += "*";
            }
            
            System.out.println(star);
        }
    }
}

/*
다른 풀이
1.
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            sb.append("*");
        }
        
        String line = sb.toString();
        
        for(int i = 0; i < m; i++) {
            System.out.println(line);
        }
    }
}

2.
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String line = "*".repeat(n);
        
        for(int i = 0; i < m; i++) {
            System.out.println(line);
        }
    }
}
*/
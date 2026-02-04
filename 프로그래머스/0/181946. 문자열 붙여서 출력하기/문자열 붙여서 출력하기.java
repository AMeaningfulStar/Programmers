/*
알고리즘: 없음 (단순 처리)
자료구조: String, StringBuilder
시간 복잡도: O(len(a) + len(b))
공간 복잡도: O(len(a) + len(b))
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(a).append(b);
        
        /*
        StringBuilder sb = new StringBuilder(a.length() + b.length());
        sb.append(a).append(b);
        */
        
        System.out.println(sb);
    }
}
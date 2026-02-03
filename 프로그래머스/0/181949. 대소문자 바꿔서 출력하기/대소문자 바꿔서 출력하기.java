// 알고리즘: 선형 탐색[O(N)]
// 자료구조: String, char (문자 단위 처리), StringBuilder (출력용)

/*
아스키코드
대문자: 'A'(65) ~ 'Z'(90)
소문자: 'a'(97) ~ 'z'(122)
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            
            if(c >= 'A' && c <= 'Z'){
                sb.append((char)(c + 32));
            }
            else {
                sb.append((char)(c - 32));
            }
            
            /*
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
            */
        }
        
        System.out.println(sb.toString());
        
        sc.close();
    }
}
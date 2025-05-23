import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int line = 0; line < n; line++) {
            String star = "";
            for(int count = 0; count < line + 1; count++){
                star += "*";
            }
            System.out.println(star);
        }
    }
}
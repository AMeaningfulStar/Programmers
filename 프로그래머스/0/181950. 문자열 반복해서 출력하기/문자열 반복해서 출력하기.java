// 알고리즘: 단순 반복(Loop)
// 자료구조: 없음(문자열 처리)

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }

        sc.close();
    }
}

class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder(str.length() * n);
        for (int i = 0; i < n; i++) sb.append(str);

        System.out.print(sb.toString());
        sc.close();
    }
}
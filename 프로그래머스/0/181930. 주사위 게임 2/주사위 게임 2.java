class Solution {
    public int solution(int a, int b, int c) {
        int sum1 = a + b + c;
        int sum2 = a * a + b * b + c * c;

        if (a == b && b == c) {
            int sum3 = a * a * a + b * b * b + c * c * c;
            return sum1 * sum2 * sum3;
        }

        if (a == b || b == c || a == c) {
            return sum1 * sum2;
        }

        return sum1;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int a, int b, int c) {
        long sum1 = (long)a + b + c;
        long sum2 = (long)a * a + (long)b * b + (long)c * c;

        if (a == b && b == c) {
            long sum3 = (long)a * a * a + (long)b * b * b + (long)c * c * c;
            return (int)(sum1 * sum2 * sum3);
        }

        if (a == b || b == c || a == c) {
            return (int)(sum1 * sum2);
        }

        return (int)sum1;
    }
}
*/
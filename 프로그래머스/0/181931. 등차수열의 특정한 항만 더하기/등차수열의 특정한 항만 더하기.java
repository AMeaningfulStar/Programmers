class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int term = a;

        for (boolean inc : included) {
            if (inc) sum += term;
            term += d;
        }

        return sum;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) sum += a + d * i;
        }

        return sum;
    }
}

*/
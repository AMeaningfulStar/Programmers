class Solution {
    public int solution(int a, int b) {
        /*
        가독성을 위한 풀이
        int ab = Integer.parseInt("" + a + b);
        int calc = 2 * a * b;
        return Math.max(ab, calc);
        */
        
        return Math.max(Integer.parseInt("" + a + b), 2 * a * b);
    }
}
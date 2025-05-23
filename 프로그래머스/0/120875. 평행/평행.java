class Solution {
    public int solution(int[][] dots) {
        boolean case1 = ((double) (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]) == ((double) (dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]))) ? true: false;
        
        boolean case2 = ((double) (dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]) == (double) (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0])) ? true : false;
        
        boolean case3 = ((double) (dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]) == (double) (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0])) ? true : false;
        
        return case1 || case2 || case3 ? 1 : 0;
    }
}
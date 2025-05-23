class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        boolean case1 = ((double) (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]) == ((double) (dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]))) ? true: false;
        
        boolean case2 = ((double) (dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]) == (double) (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0])) ? true : false;
        
        boolean case3 = ((double) (dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]) == (double) (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0])) ? true : false;
        
        return case1 || case2 || case3 ? 1 : 0;
    }
}
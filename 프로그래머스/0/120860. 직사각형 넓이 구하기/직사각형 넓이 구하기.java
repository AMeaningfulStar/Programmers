class Solution {
    public int solution(int[][] dots) {
        int w = 0;
        int h = 0;
        int[] add = dots[0];
        for (int i = 1; i < dots.length; i++) {
            if (add[0] != dots[i][0]) w = Math.abs(add[0] - dots[i][0]);
            if (add[1] != dots[i][1]) h = Math.abs(add[1] - dots[i][1]);
        }
        return w * h;
    }
}
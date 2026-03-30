/*
• 알고리즘: 기울기 비교 (Slope Comparison)
• 핵심 개념
 • 점 4개로 만들 수 있는 선분 쌍 3가지 확인
 • 평행 조건 = 기울기 동일
 • 나눗셈 대신 곱셈으로 비교
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[][] dots) {
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        
        return 0;
    }
    
    private boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
        return (b[1] - a[1]) * (d[0] - c[0]) == (d[1] - c[1]) * (b[0] - a[0]);
    }
}

/*
다른 풀이
class Solution {
    public int solution(int[][] dots) {
        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])) return 1;
        if (getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) return 1;
        if (getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])) return 1;
        
        return 0;
    }
    
    private double getSlope(int[] a, int[] b) {
        return (double)(b[1] - a[1]) / (b[0] - a[0]);
    }
}
*/
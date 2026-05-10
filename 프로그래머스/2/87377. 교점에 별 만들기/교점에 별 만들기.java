/*
• 알고리즘 유형: 수학 / 구현 / 브루트포스
• 핵심 개념: 모든 직선 쌍 교점 계산, 정수 좌표만 저장, 좌표 변환
• 시간 복잡도: O(N²)
• 공간 복잡도: O(교점 수 + 출력 크기)
*/

import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        List<long[]> points = new ArrayList<>();
        
        long minX = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long minY = Long.MAX_VALUE;
        long maxY = Long.MIN_VALUE;
        
        for (int i = 0; i < line.length - 1; i++) {
            long a = line[i][0];
            long b = line[i][1];
            long e = line[i][2];
            
            for (int j = i + 1; j < line.length; j++) {
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];
                
                long denominator = a * d - b * c;
                
                if (denominator == 0) continue;
                
                long xNumerator = b * f - e * d;
                long yNumerator = e * c - a * f;
                
                if (xNumerator % denominator != 0 || yNumerator % denominator != 0) {
                    continue;
                }
                
                long x = xNumerator / denominator;
                long y = yNumerator / denominator;
                
                points.add(new long[]{x, y});
                
                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }
        }
        
        int height = (int) (maxY - minY + 1);
        int width = (int) (maxX - minX + 1);
        
        char[][] board = new char[height][width];
        
        for (int i = 0; i < height; i++) {
            Arrays.fill(board[i], '.');
        }
        
        for (long[] point : points) {
            long x = point[0];
            long y = point[1];
            
            int row = (int) (maxY - y);
            int col = (int) (x - minX);
            
            board[row][col] = '*';
        }
        
        String[] answer = new String[height];
        
        for (int i = 0; i < height; i++) {
            answer[i] = new String(board[i]);
        }
        
        return answer;
    }
}
/*
• 알고리즘 유형: 구현 / 2차원 배열 탐색
• 핵심 개념
 • # 위치 전체 탐색
 • 최소 행/열, 최대 행/열 갱신
 • 오른쪽 아래 경계는 +1 처리
• 시간 복잡도: O(H × W)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(String[] wallpaper) {
        int minRow = wallpaper.length;
        int minCol = wallpaper[0].length();
        int maxRow = 0;
        int maxCol = 0;
        
        for (int row = 0; row < wallpaper.length; row++) {
            for (int col = 0; col < wallpaper[row].length(); col++) {
                if (wallpaper[row].charAt(col) == '#') {
                    minRow = Math.min(minRow, row);
                    minCol = Math.min(minCol, col);
                    maxRow = Math.max(maxRow, row + 1);
                    maxCol = Math.max(maxCol, col + 1);
                }
            }
        }
        
        return new int[]{minRow, minCol, maxRow, maxCol};
    }
}
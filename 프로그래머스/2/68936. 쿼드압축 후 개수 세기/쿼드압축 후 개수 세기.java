/*
• 알고리즘 유형: 분할정복 / 재귀
• 핵심 개념
 • 현재 정사각형이 모두 같은 값인지 확인
 • 같으면 0 또는 1 개수 증가
 • 다르면 4등분 재귀
• 시간 복잡도: 최악에는 O(N² log N) 느낌으로 볼 수 있음
• 공간 복잡도: 재귀 깊이 O(log N)
*/

class Solution {
    int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        compress(0, 0, arr.length, arr);
        return answer;
    }
    
    private void compress(int x, int y, int size, int[][] arr) {
        if (isSame(x, y, size, arr)) {
            answer[arr[x][y]]++;
            return;
        }
        
        int half = size / 2;
        
        compress(x, y, half, arr);
        compress(x, y + half, half, arr);
        compress(x + half, y, half, arr);
        compress(x + half, y + half, half, arr);
    }
    
    private boolean isSame(int x, int y, int size, int[][] arr) {
        int value = arr[x][y];
        
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
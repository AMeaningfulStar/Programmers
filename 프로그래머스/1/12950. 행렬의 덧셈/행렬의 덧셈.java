/*
• 알고리즘: 2차원 배열 순회
• 핵심 개념
 • 행(row), 열(column) 구조 이해
 • 동일 인덱스 접근
• 시간 복잡도: O(N × M)
• 공간 복잡도: O(N × M)
*/

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        
        int[][] answer = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        return IntStream.range(0, arr1.length)
                .mapToObj(i -> IntStream.range(0, arr1[0].length)
                        .map(j -> arr1[i][j] + arr2[i][j])
                        .toArray())
                .toArray(int[][]::new);
    }
}
*/
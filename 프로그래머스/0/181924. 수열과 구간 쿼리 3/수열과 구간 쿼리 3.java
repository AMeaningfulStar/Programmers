/*
알고리즘: 반복 처리
자료구조: int[], int[][], int temp
시간복잡도: O(1)
공간복잡도: O(1)
*/
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int i = q[0];
            int j = q[1];

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
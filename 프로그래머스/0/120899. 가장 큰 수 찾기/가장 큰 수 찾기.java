/*
• 알고리즘: 배열 순회 + 최댓값 탐색 (Array Traversal & Max Search)
• 핵심 개념
 • 최댓값 추적 변수
 • 인덱스 동시 관리
 • 초기값 설정 중요
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int idx = 0;
        
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                idx = i;
            }
        }
        
        return new int[]{max, idx};
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(int[] array) {
        int max = array[0], idx = 0;

        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                idx = i;
            }
        }

        return new int[]{max, idx};
    }
}
*/
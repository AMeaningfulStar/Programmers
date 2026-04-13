/*
• 알고리즘 유형: DFS / 백트래킹
• 핵심 개념
 • 각 숫자마다 + / - 선택
 • 모든 경우 탐색
 • target 도달 시 count 증가
• 시간 복잡도: O(2^N)
• 공간 복잡도: O(N) (재귀 스택)
*/

class Solution {
    int count = 0;
    
    private void dfs(int idx, int result, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (result == target) count++;
            return;
        }
        
        dfs(idx + 1, result + numbers[idx], numbers, target);
        dfs(idx + 1, result - numbers[idx], numbers, target);
    }
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return count;
    }
}
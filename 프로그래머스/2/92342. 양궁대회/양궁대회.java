/*
• 알고리즘 유형: DFS / 백트래킹 / 완전탐색
• 핵심 개념: 점수 구간별 승리/포기 선택
• 시간 복잡도: O(2¹¹)
• 공간 복잡도: O(11)
*/

class Solution {
    int[] answer = {-1};
    int maxDiff = 0;
    
    public int[] solution(int n, int[] info) {
        int[] lion = new int[11];
        dfs(0, n, info, lion);
        return answer;
    }
    
    private void dfs(int idx, int arrows, int[] apeach, int[] lion) {
        if (idx >= 11) {
            if (arrows > 0) {
                lion[10] += arrows;
            }
            
            checkScore(apeach, lion);
            
            if (arrows > 0) {
                lion[10] -= arrows;
            }

            return;
        }
        
        int need = apeach[idx] + 1;
        if (arrows >= need) {
            lion[idx] = need;
            dfs(idx + 1, arrows - need, apeach, lion);
            lion[idx] = 0;
        }
        
        dfs(idx + 1, arrows, apeach, lion);
    }
    
    private void checkScore(int[] apeach, int[] lion) {
        int apeachScore = 0;
        int lionScore = 0;
        
        for (int i = 0; i < 11; i++) {
            int score = 10 - i;
            
            if (apeach[i] == 0 && lion[i] == 0) continue;
            
            if (lion[i] > apeach[i]) {
                lionScore += score;
            } else {
                apeachScore += score;
            }
        }
        
        int diff = lionScore - apeachScore;
        
        if (diff <= 0) return;
        
        if (diff > maxDiff) {
            maxDiff = diff;
            answer = lion.clone();
        } else if (diff == maxDiff && isBetter(lion, answer)) {
            answer = lion.clone();
        }
    }
    
    private boolean isBetter(int[] lion, int[] currentAnswer) {
        for (int i = 10; i >= 0; i--) {
            if (lion[i] > currentAnswer[i]) return true;
            if (lion[i] < currentAnswer[i]) return false;
        }
        
        return false;
    }
}
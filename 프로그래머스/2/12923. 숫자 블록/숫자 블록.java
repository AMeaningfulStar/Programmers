/*
• 알고리즘 유형: 수학 / 약수 탐색
• 핵심 개념: 자기 자신을 제외한 가장 큰 약수 찾기, 10,000,000 제한
• 시간 복잡도: O((end-begin+1) × √end)
• 공간 복잡도: O(end-begin+1)
*/

class Solution {
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int)(end - begin + 1)];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = maxNum(begin + i);
        }
        
        return answer;
    }
    
    private int maxNum(long target) {
        if (target == 1) {
            return 0;
        }
        
        int result = 1;
        
        for (long d = 2; d * d <= target; d++) {
            if (target % d == 0) {
                long pair = target / d;
                
                if (pair <= 10_000_000) {
                    return (int) pair;
                }
                
                if (d <= 10_000_000) {
                    result = (int) d;
                }
            }
        }
        
        return result;
    }
}
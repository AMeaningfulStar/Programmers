/*
• 알고리즘: 완전탐색 + 약수 탐색
• 핵심 개념
 • yellow의 약수 쌍 찾기
 • 또는 brown + yellow의 약수 쌍 찾기
 • 카펫 테두리 조건 검증
• 시간 복잡도: O(N) 또는 O(√N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        for(int h = 3; h * h <= total; h++) {
            if(total % h != 0) continue;
            
            int w = total / h;
            
            if((w - 2) * (h - 2) == yellow) {
                return new int[]{w, h};
            }
        }
        
        return new int[]{0, 0};
    }
}
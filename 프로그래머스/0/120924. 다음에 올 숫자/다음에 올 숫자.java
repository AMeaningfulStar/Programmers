/*
• 알고리즘: 패턴 탐지 (등차 / 등비)
• 핵심 개념
 • 차이 비교
 • 비율 비교
 • 마지막 값 기반 계산
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] common) {
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];
        
        if (diff1 == diff2) {
            return common[common.length - 1] + diff1;
        }
        
        int ratio = common[1] / common[0];
        return common[common.length - 1] * ratio;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int[] common) {
        int a = common[0];
        int b = common[1];
        int c = common[2];
        
        // 등차수열
        if (b - a == c - b) {
            int diff = b - a;
            return common[common.length - 1] + diff;
        }
        
        // 등비수열
        int ratio = b / a;
        return common[common.length - 1] * ratio;
    }
}
*/
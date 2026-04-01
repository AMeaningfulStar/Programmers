/*
• 알고리즘: 완전 탐색 / 약수 찾기
• 핵심 개념
 • 나머지 조건 변형
 • 약수 탐색
• 시간 복잡도: O(n)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) return i;
        }
        return -1;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int n) {
        int target = n - 1;
        
        for (int i = 2; i <= target; i++) {
            if (target % i == 0) return i;
        }
        
        return target;
    }
}
*/
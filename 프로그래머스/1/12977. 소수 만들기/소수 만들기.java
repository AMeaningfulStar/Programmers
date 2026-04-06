/*
• 알고리즘 유형: 완전탐색 / 조합
• 핵심 개념 목록
 • 서로 다른 3개 선택
 • i < j < k로 중복 제거
 • 합 계산
 • 소수 판별
• 시간 복잡도: O(N³)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}
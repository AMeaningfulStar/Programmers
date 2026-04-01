/*
• 알고리즘: 자릿수 분해
• 핵심 개념
 • % 10 → 마지막 자리
 • / 10 → 자리 제거
 • 합산 후 나눗셈 체크
• 시간 복잡도: O(log N)
• 공간 복잡도: O(1)
*/

class Solution {
    public boolean solution(int x) {
        int num = x;
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return x % sum == 0;
    }
}
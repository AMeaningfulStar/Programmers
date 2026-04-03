/*
• 알고리즘: 투포인터 (Two Pointers)
• 핵심 개념
 • 연속된 구간의 합 관리
 • 합이 작으면 오른쪽 확장
 • 합이 크면 왼쪽 축소
 • 합이 같으면 정답 카운트
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int left = 1;
        int right = 1;
        int sum = 1;
        
        while (left <= n) {
            if (sum == n) {
                answer++;
                sum -= left;
                left++;
            } else if (sum < n) {
                right++;
                sum += right;
            } else {
                sum -= left;
                left++;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1) {
                count++;
            }
        }
        
        return count;
    }
}
*/
/*
• 알고리즘: 수학적 성질 활용 (Perfect Square Check)
• 핵심 개념
 • 약수는 보통 쌍으로 존재
 • 완전제곱수만 약수 개수가 홀수
 • root * root == num 으로 완전제곱수 판별
• 시간 복잡도: O(right - left + 1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int num = left; num <= right; num++) {
            int count = 0;
            
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    count += (i * i == num) ? 1 : 2;
                }
            }
            
            answer += (count % 2 == 0) ? num : -num;
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int num = left; num <= right; num++) {
            int root = (int) Math.sqrt(num);
            
            if (root * root == num) {
                answer -= num; // 약수 개수 홀수
            } else {
                answer += num; // 약수 개수 짝수
            }
        }
        
        return answer;
    }
}
*/
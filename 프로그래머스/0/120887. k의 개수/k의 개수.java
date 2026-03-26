/*
• 알고리즘: 완전탐색 + 자리수 분해
• 핵심 개념
 • 숫자 → 문자열 or 자릿수 분해
 • 각 자리 비교
 • 누적 카운트
• 시간 복잡도: O(N × 자릿수)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char target = (char)(k + '0');
        
        for(int num = i; num <= j; num++) {
            for(char c : String.valueOf(num).toCharArray()) {
                if(c == target) answer++;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int num = i; num <= j; num++) {
            int temp = num;
            
            while(temp > 0) {
                if(temp % 10 == k) answer++;
                temp /= 10;
            }
        }
        
        return answer;
    }
}
*/
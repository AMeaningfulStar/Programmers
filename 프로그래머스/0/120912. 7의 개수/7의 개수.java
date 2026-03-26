/*
• 알고리즘: 자리수 분해 (Digit Decomposition)
• 핵심 개념
 • % 10 → 마지막 자리
 • / 10 → 자리 이동
 • 반복 → 전체 자리 탐색
• 시간 복잡도: O(N × 자릿수)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int num:array) {
            int temp = num;
            
            while(temp > 0) {
                if(temp % 10 == 7) answer++;
                temp /= 10;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int num : array) {
            for(char c : String.valueOf(num).toCharArray()) {
                if(c == '7') answer++;
            }
        }
        
        return answer;
    }
}
*/
/*
• 알고리즘: 시뮬레이션 (Simulation)
• 핵심 개념
 • 1부터 차례대로 숫자 증가
 • 3의 배수 판별 (num % 3 == 0)
 • 숫자 3 포함 여부 판별 (contains("3"))
 • 유효한 숫자만 카운트
• 시간 복잡도: O(N × D)
 • D는 숫자를 문자열로 바꿨을 때 자릿수 길이
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int n) {
        int count = 0;
        int num = 0;
        
        while (count < n) {
            num++;
            
            if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue;
            }
            
            count++;
        }
        
        return num;
    }
}
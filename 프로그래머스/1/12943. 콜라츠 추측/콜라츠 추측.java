/*
• 알고리즘: 시뮬레이션 (Simulation)
• 핵심 개념
 • 조건에 따른 수 변환
 • 반복 횟수 카운트
 • 오버플로우 방지를 위한 long 사용
• 시간 복잡도: O(500) ≈ O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int num) {
        long n = num;
        
        for (int count = 0; count <= 500; count++) {
            if (n == 1) return count;
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        
        return -1;
    }
}
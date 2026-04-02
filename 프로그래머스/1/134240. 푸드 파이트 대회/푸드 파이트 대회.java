/*
• 알고리즘: 구현 + 문자열 구성
• 핵심 개념
 • 절반만 사용 (food[i] / 2)
 • 대칭 구조 만들기
 • reverse 활용
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            
            for (int j = 0; j < count; j++) {
                left.append(i);
            }
        }
        
        StringBuilder right = new StringBuilder(left).reverse();
        
        return left.toString() + "0" + right.toString();
    }
}
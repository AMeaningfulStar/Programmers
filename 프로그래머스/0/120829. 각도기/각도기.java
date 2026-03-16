/*
• 알고리즘: 조건 분기 (Conditional Branching)
• 핵심 개념
 • 입력 값 범위 비교
 • if 조건문을 이용한 케이스 분류
 • 각도 범위에 따른 결과 반환
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int angle) {
        if(angle < 90) return 1;
        else if(angle == 90) return 2;
        else if(angle < 180) return 3;
        else return 4;
    }
}
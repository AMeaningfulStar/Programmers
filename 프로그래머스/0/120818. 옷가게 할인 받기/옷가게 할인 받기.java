/*
• 알고리즘: 조건 분기 (Conditional Branching)
• 핵심 개념
 • 구간 분기 처리
 • 큰 값부터 조건 검사
 • 정수 연산으로 할인 계산
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int price) {
        if (price >= 500000) {
            return (int) (price * 0.8);
        } else if (price >= 300000) {
            return (int) (price * 0.9);
        } else if (price >= 100000) {
            return (int) (price * 0.95);
        }
        
        return price;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int price) {
        if (price >= 500000) {
            return price * 80 / 100;
        } else if (price >= 300000) {
            return price * 90 / 100;
        } else if (price >= 100000) {
            return price * 95 / 100;
        }
        
        return price;
    }
}
*/
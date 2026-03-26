/*
• 알고리즘: 시뮬레이션 + 수학적 최적화
• 핵심 개념
 • 반복 상태 갱신
 • 몫/나머지 활용
 • 쿠폰 재사용 구조
 • 수학적 패턴 도출 ((n-1)/9)
• 시간 복잡도:
 • 시뮬레이션: O(log N)
 • 수학: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(chicken > 9) {
            answer += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int chicken) {
        return (chicken - 1) / 9;
    }
}
*/
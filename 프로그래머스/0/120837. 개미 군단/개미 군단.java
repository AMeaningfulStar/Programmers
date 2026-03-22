/*
• 알고리즘: 그리디 (Greedy Algorithm)
• 핵심 개념
 • 큰 단위부터 선택
 • 몫과 나머지 활용
 • 최적해 보장 구조
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5;
        hp = hp % 5;
        
        answer += hp / 3;
        hp = hp % 3;
        
        answer += hp / 1;
        
        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int hp) {
        return hp / 5 + (hp % 5) / 3 + (hp % 5 % 3);
    }
}

2.
class Solution {
    public int solution(int hp) {
        int general = hp / 5;
        int soldier = (hp % 5) / 3;
        int worker = hp % 5 % 3;

        return general + soldier + worker;
    }
}
*/
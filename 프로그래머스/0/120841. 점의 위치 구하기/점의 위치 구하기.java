/*
• 알고리즘: 조건 분기 (Conditional Branching)
• 핵심 개념
 • 좌표의 부호(양수/음수) 판단
 • x, y 값에 따른 사분면 분류
 • 중첩 조건 분기 처리
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] dot) {
        if(dot[0] > 0) {
            return dot[1] > 0 ? 1 : 4;
        } else {
            return dot[1] > 0 ? 2 : 3;
        }
    }
}

/*
다른 풀이
class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if(x > 0 && y > 0) return 1;
        else if(x < 0 && y > 0) return 2;
        else if(x < 0 && y < 0) return 3;
        else return 4;
    }
}
*/
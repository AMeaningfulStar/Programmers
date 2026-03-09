/*
알고리즘: 사전식 비교 (Lexicographical Comparison)
핵심 개념
• 배열 요소를 순서대로 비교
• 첫 번째로 다른 값에서 결과 결정
시간 복잡도: O(1)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] date1, int[] date2) {
        if(date1[0] != date2[0]) {
            return date1[0] < date2[0] ? 1 : 0;
        }

        if(date1[1] != date2[1]) {
            return date1[1] < date2[1] ? 1 : 0;
        }

        return date1[2] < date2[2] ? 1 : 0;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int[] date1, int[] date2) {
        for(int i = 0; i < 3; i++) {
            if(date1[i] != date2[i]) {
                return date1[i] < date2[i] ? 1 : 0;
            }
        }
        return 0;
    }
}
*/
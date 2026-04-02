/*
• 알고리즘: 브루트포스 / 조합 탐색
• 핵심 개념
 • 3명 조합 생성 (i < j < k)
 • 세 수의 합 확인
 • 중복 없는 조합 카운트
• 시간 복잡도: O(N³)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}
/*
• 알고리즘 유형: 구현 / 문자열 / 진수 변환
• 핵심 개념
 • 숫자를 n진수 문자열로 변환
 • 문자 단위로 차례 진행
 • 튜브 차례의 문자만 수집
 • t개 모이면 종료
• 시간 복잡도: 필요한 문자 수만큼 생성
• 공간 복잡도: O(t)
*/

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        
        int num = 0;
        int turn = 1;
        
        while(answer.length() < t){
            String number = Integer.toString(num, n);
            
            for(char c: number.toCharArray()) {
                if(turn == p && answer.length() < t) {
                    answer.append(Character.toUpperCase(c));
                }
                
                turn = turn + 1 > m ? 1 : turn + 1;
            }
            
            num++;
        }
        
        return answer.toString();
    }
}
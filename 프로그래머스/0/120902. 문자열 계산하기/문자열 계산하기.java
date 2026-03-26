/*
• 알고리즘: 문자열 파싱 + 누적 연산 (Sequential Evaluation)
• 핵심 개념
 • 문자열 분리 (split)
 • 토큰 순회
 • 누적 계산 (accumulator)
 • 연산자 분기 처리
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        
        int answer = Integer.parseInt(arr[0]);
        
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i + 1]);
            } else {
                answer -= Integer.parseInt(arr[i + 1]);
            }
        }
        
        return answer;
    }
}
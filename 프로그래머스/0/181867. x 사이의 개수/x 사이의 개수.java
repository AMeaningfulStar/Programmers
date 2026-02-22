/*
알고리즘: 문자열 분리 + 길이 매핑
핵심 개념:
• split("x", -1)로 모든 구간 분리
• 'x' 사이의 문자열 길이 계산
• 연속된 구분자는 빈 문자열 생성
시간 복잡도: O(N)
공간 복잡도: O(N)
*/

class Solution {
    public int[] solution(String myString) {
        String[] str_arr = myString.split("x", -1);
        
        int[] answer = new int[str_arr.length];
        
        for (int i = 0; i < str_arr.length; i++) {
            answer[i] = str_arr[i].length();
        }
        
        return answer;
    }
}
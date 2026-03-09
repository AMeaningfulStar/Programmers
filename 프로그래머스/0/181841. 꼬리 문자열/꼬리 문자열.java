/*
알고리즘: 선형 순회 + 조건 필터링
핵심 개념:
• 문자열 배열 순회
• contains()로 부분 문자열 포함 여부 확인
• 조건에 맞는 문자열만 StringBuilder에 추가
시간 복잡도: O(N × M)
• N = str_list 길이
• M = 문자열 길이
공간 복잡도: O(N)
*/

class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        
        for(String str: str_list) {
            if(!str.contains(ex)) {
               answer.append(str);
            }
        }
        return answer.toString();
    }
}
/*
알고리즘: 선형 순회
핵심 개념:
• 두 배열(my_strings, parts)을 같은 인덱스로 동기화해서 처리
• 구간 추출: substring(s, e + 1) (끝 인덱스 미포함 특성 보정)
• 문자열 누적 결합: StringBuilder.append
시간 복잡도: O(T) (T = 잘라낸 조각들의 총 길이, substring/append가 길이에 비례)
공간 복잡도: O(T) (결과 문자열 저장)
*/

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        
        for(int idx = 0; idx < my_strings.length; idx++) {
            answer.append(my_strings[idx].substring(parts[idx][0],parts[idx][1] + 1));
        }
        
        return answer.toString();
    }
}
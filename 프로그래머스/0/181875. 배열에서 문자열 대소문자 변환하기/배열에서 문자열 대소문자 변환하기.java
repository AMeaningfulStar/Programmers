/*
알고리즘: 선형 순회 + 인덱스 조건 분기
핵심 개념:
• 인덱스 기반 짝/홀 판별
• 문자열 불변성 → 변환 시 새 문자열 생성
• 삼항 연산자를 통한 조건 분기
시간 복잡도: O(N × M) (N = 배열 길이, M = 평균 문자열 길이)
공간 복잡도: O(N × M) (새 문자열 배열 생성)
*/

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int idx = 0; idx < answer.length; idx++) {
            answer[idx] = idx % 2 == 0 ? strArr[idx].toLowerCase() : strArr[idx].toUpperCase(); 
        }
        
        return answer;
    }
}
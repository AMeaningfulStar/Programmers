/*
알고리즘: 선형 순회(고정 간격 점프)
핵심 개념:
• 문자열 인덱스를 r부터 시작
• 매 반복마다 q씩 증가하는 등차 수열 형태의 인덱스 접근
• charAt(idx)를 이용한 랜덤 접근
• StringBuilder로 결과 누적
시간 복잡도: O(N / q) (N = code.length(), 접근하는 문자 개수만큼)
공간 복잡도: O(N / q) (결과 문자열 길이만큼)
*/
class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        
        for(int idx = r; idx < code.length(); idx += q) {
            answer.append(code.charAt(idx));
        }
        
        return answer.toString();
    }
}
/*
알고리즘: 고정 간격 인덱스 점프
핵심 개념:
• 5명 단위 그룹화
• 올림 나눗셈 공식: (length + k - 1) / k
• 그룹 첫 원소 인덱스: i * 5
• 배열 직접 생성 후 매핑
시간 복잡도: O(N / 5)
공간 복잡도: O(N / 5)
*/

class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length + 5 - 1) / 5];
        
        for(int idx = 0; idx < answer.length; idx++) {
            answer[idx] = names[idx * 5];
        }
        
        return answer;
    }
}
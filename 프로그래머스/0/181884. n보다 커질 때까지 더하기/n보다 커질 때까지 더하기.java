/*
알고리즘: 선형 순회 + 누적 합 + 조기 종료
핵심 개념:
• 누적 합(accumulation)
• 조건 만족 시 즉시 반환(early return)
• for-each 반복문을 통한 단순 순회
시간 복잡도: O(K) (K = 초과 시점까지의 원소 개수, 최악 O(N))
공간 복잡도: O(1) (정수 변수 하나만 사용)
*/

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int num: numbers) {
            answer += num;
            
            if(answer > n) {
                return answer;
            }
        }
        
        return answer;
    }
}
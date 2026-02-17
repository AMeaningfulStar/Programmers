/*
알고리즘: 반복 시뮬레이션(Repeated Halving)
핵심 개념:
• 각 숫자를 1이 될 때까지 2로 나누는 과정
• 정수 나눗셈 특성으로 홀수도 num /= 2로 처리 가능
• 각 원소별 연산 횟수를 누적 합산
시간 복잡도: O(∑ log₂(numᵢ)) (각 숫자가 2로 나눠질 때마다 절반으로 줄어들기 때문)
공간 복잡도: O(1) (추가 자료구조 없음)
*/

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int num: num_list) {
            while(num != 1) {
                if(num % 2 == 0) {
                    num /= 2;
                    answer++;
                } else {
                    num = (num - 1) / 2;
                    answer++;
                }
            }
        }
        
        return answer;
    }
}

/*
더 간결한 풀이
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        for (int num : num_list) {
            while (num > 1) {
                num /= 2;
                answer++;
            }
        }

        return answer;
    }
}
*/
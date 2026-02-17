/*
알고리즘: 조건 분기 + 선형 누적(합/곱)
핵심 개념:
• 입력 크기(배열 길이)에 따른 로직 분기
• 합은 누적 변수 0으로 시작
• 곱은 누적 변수 1로 시작(곱셈의 항등원)
• 배열을 한 번 순회하며 결과 계산
시간 복잡도: O(N)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if(num_list.length > 10) {
            for(int num: num_list) {
                answer += num;
            }
        } else {
            answer++;
            
            for(int num: num_list) {
                answer *= num;
            }
        }
        
        return answer;
    }
}

/*
더 깔끔한 풀이
class Solution {
    public int solution(int[] num_list) {
        if (num_list.length > 10) {
            int sum = 0;
            for (int num : num_list) sum += num;
            return sum;
        } else {
            int prod = 1;
            for (int num : num_list) prod *= num;
            return prod;
        }
    }
}
*/
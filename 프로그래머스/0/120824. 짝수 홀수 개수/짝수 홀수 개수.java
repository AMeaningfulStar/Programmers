/*
• 알고리즘: 배열 순회 + 카운팅 (Array Traversal & Counting)
• 핵심 개념
 • 배열 전체 순회
 • 짝수/홀수 판별 (num % 2)
 • 조건에 따른 카운트 증가
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for(int num: num_list) {
            if(num % 2 == 0) {
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for(int num : num_list) {
            answer[num % 2 == 0 ? 0 : 1]++;
        }
        
        return answer;
    }
}
*/
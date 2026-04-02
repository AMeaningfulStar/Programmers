/*
• 알고리즘: 수학 / 누적합
• 핵심 개념
 • 전체 합 - 부분 합
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] numbers) {
        int [] num_list = new int[10];
        
        for(int i = 0; i < numbers.length; i++) {
            num_list[numbers[i]]++;
        }
        
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] == 0) answer += i;
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for (int num : numbers) {
            answer -= num;
        }
        
        return answer;
    }
}
*/
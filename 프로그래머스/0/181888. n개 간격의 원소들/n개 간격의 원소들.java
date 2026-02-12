/*
알고리즘: 고정 간격 인덱스 점프
핵심 개념:
• 등차 수열 인덱스: 0, n, 2n, 3n, ...
• 결과 길이 계산 공식: (length + n - 1) / n (올림 나눗셈)
• 배열 인덱스 매핑: i * n
시간 복잡도: O(N / n)
공간 복잡도: O(N / n)
*/

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        if(num_list.length % n == 0) {
            answer = new int[num_list.length / n];
        } else {
            answer = new int[(num_list.length / n) + 1];
        }
        
        for(int idx = 0; idx < answer.length; idx++) {
            answer[idx] = num_list[idx * n];
        }
        
        return answer;
    }
}

/*
더 깔끔한 코드
class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = (num_list.length + n - 1) / n;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i * n];
        }

        return answer;
    }
}
*/
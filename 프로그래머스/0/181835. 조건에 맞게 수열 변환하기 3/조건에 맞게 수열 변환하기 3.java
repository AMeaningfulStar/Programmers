/*
알고리즘: 선형 순회 + 조건 분기
핵심 개념:
• 배열 순회
• 홀짝 판별 (% 2)
• 조건에 따라 연산 수행
시간 복잡도: O(N)
공간 복잡도: O(N)
*/

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        boolean isEven = k % 2 == 0;

        for(int i = 0; i < arr.length; i++) {
            answer[i] = isEven ? arr[i] + k : arr[i] * k;
        }

        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            answer[i] = (k % 2 == 0) ? arr[i] + k : arr[i] * k;
        }

        return answer;
    }
}
*/
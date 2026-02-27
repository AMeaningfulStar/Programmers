/*
알고리즘: 반복 곱셈을 통한 2의 거듭제곱 탐색
핵심 개념:
• 2의 거듭제곱은 1,2,4,8,16,...
• 현재 길이 이상이 될 때까지 2배씩 증가
• 새 배열 생성 후 기존 값 복사
시간 복잡도: O(N) (배열 복사)
공간 복잡도: O(N) (확장 배열 생성)
*/

class Solution {
    public int[] solution(int[] arr) {
        int len = 1;

        while (len < arr.length) {
            len *= 2;
        }

        int[] answer = new int[len];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
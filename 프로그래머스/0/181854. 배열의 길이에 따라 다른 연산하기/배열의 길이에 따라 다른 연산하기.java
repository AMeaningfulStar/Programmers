/*
알고리즘: 조건 기반 인덱스 점프 순회
핵심 개념:
• 배열 길이의 홀짝 판별 (length % 2)
• 시작 인덱스를 삼항 연산자로 결정
• 2칸씩 증가 (idx += 2)
• 원본 배열을 in-place 수정
시간 복잡도: O(N)
공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(int[] arr, int n) {
        int idx = 0;
        
        for(idx = arr.length % 2 != 0 ? 0 : 1; idx < arr.length; idx += 2) {
            arr[idx] += n;
        }
        
        return arr;
    }
}
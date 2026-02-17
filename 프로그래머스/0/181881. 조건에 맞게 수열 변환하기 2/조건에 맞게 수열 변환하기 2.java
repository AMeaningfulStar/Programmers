/*
알고리즘: 반복 시뮬레이션 + 상태 변화 감지
핵심 개념:
• 조건에 따른 배열 값 변환
• 변화 여부 플래그(boolean changed)
• 변화가 없을 때 종료하는 반복 구조
• in-place 배열 수정
시간 복잡도: O(K × N) (K = 변화가 멈출 때까지의 반복 횟수, N = 배열 길이)
공간 복잡도: O(1) (추가 자료구조 없음)
*/

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        boolean check = true;
        
        while(check) {
            answer++;
            
            check = false;
            
            for(int idx = 0; idx < arr.length; idx++) {
                if(arr[idx] >= 50 && arr[idx] % 2 == 0) {
                    arr[idx] = arr[idx] / 2;
                    check = true;
                } else if (arr[idx] < 50 && arr[idx] % 2 == 1){
                    arr[idx] = arr[idx] * 2 + 1;
                    check = true;
                }
            }
        }
        
        return answer - 1;
    }
}

/*
더 깔끔한 풀이
class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            boolean changed = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    changed = true;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                    changed = true;
                }
            }

            if (!changed) break;
            answer++;
        }

        return answer;
    }
}
*/
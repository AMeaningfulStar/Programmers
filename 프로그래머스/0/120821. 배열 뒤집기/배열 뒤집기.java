/*
• 알고리즘: 배열 순회 (Array Traversal)
• 핵심 개념
 • 인덱스를 이용한 역순 접근
 • 새로운 배열에 값 재배치
 • length - idx - 1 인덱스 계산
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int idx = 0; idx < num_list.length; idx++) {
            answer[idx] = num_list[num_list.length - idx - 1];
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(int[] num_list) {
        int left = 0;
        int right = num_list.length - 1;

        while(left < right) {
            int temp = num_list[left];
            num_list[left] = num_list[right];
            num_list[right] = temp;

            left++;
            right--;
        }

        return num_list;
    }
}
*/
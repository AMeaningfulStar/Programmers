/*
• 알고리즘 유형: 스택 / 구현
• 핵심 개념
 • 재료를 순서대로 쌓기
 • 최근 4개가 1,2,3,1인지 확인
 • 맞으면 제거
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] stack = new int[ingredient.length];
        int top = 0;

        for (int num : ingredient) {
            stack[top++] = num;

            if (top >= 4 &&
                stack[top - 4] == 1 &&
                stack[top - 3] == 2 &&
                stack[top - 2] == 3 &&
                stack[top - 1] == 1) {
                
                top -= 4;   // 햄버거 제거
                answer++;
            }
        }

        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int num : ingredient) {
            sb.append(num);

            if (sb.length() >= 4 &&
                sb.substring(sb.length() - 4).equals("1231")) {
                sb.delete(sb.length() - 4, sb.length());
                answer++;
            }
        }

        return answer;
    }
}
*/
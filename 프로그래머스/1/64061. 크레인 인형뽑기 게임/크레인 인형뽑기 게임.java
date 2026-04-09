/*
• 알고리즘 유형: 구현 / 스택
• 핵심 개념
 • 선택한 열에서 위에서부터 첫 인형 찾기
 • 바구니는 스택처럼 동작
 • top과 같으면 제거
• 시간 복잡도: O(moves.length × board.length)
• 공간 복잡도: O(moves.length)
*/

class Solution {
    public int solution(int[][] board, int[] moves) {
        int[] basket = new int[moves.length];
        int len = board.length;
        int idx = 0;
        int answer = 0;
        
        for (int i = 0; i < moves.length; i++) {
            int line = moves[i];
            
            for (int j = 0; j < len; j++) {
                if (board[j][line - 1] != 0) {
                    if (idx > 0 && basket[idx - 1] == board[j][line - 1]) {
                        board[j][line - 1] = 0;
                        idx--;
                        answer += 2;
                        break;
                    } else {
                        basket[idx++] = board[j][line - 1];
                        board[j][line - 1] = 0;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int n = board.length;

        for (int move : moves) {
            int col = move - 1;

            for (int row = 0; row < n; row++) {
                if (board[row][col] != 0) {
                    int doll = board[row][col];
                    board[row][col] = 0;

                    if (!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
*/
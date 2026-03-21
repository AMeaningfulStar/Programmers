/*
• 알고리즘: 배열 생성 + 반복 (Array Construction & Iteration)
• 핵심 개념
 • 일정 간격 반복 (num += 2)
 • 또는 수학적 패턴 (2*i + 1)
 • 결과 배열 직접 생성
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int num = 1; num <= n; num += 2) {
            list.add(num);
        }
        
        int[] answer = new int[list.size()];
        
        for(int idx = 0; idx < list.size(); idx++) {
            answer[idx] = list.get(idx);
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2;
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++) {
            answer[i] = 2 * i + 1;
        }
        
        return answer;
    }
}
*/
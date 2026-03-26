/*
• 알고리즘: 소인수분해 (Prime Factorization)
• 핵심 개념
 • 2부터 시작해서 나누어 떨어지는 수 찾기
 • 나누어 떨어지면 소인수로 추가
 • 같은 소인수는 while로 모두 제거
 • 중복 없이 한 번만 저장
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int num = 2; num <= n; num++) {
            if (n == 1) break;
            
            if (n % num == 0) {
                list.add(num);
                
                while (n % num == 0) {
                    n /= num;
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int num = 2; num * num <= n; num++) {
            if (n % num == 0) {
                list.add(num);
                
                while (n % num == 0) {
                    n /= num;
                }
            }
        }
        
        if (n > 1) {
            list.add(n);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
*/
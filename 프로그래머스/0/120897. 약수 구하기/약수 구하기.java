/*
• 알고리즘: 약수 탐색 (Divisor Search)
• 핵심 개념
 • 나눗셈 (n % i == 0)
 • 약수 쌍 개념
 • √n 최적화
• 시간 복잡도: O(√N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}

/*
다른 풀이
import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                list.add(i);
                if(i != n / i) {
                    list.add(n / i);
                }
            }
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
*/
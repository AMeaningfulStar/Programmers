/*
• 알고리즘: 슬라이딩 윈도우 + 해시맵
• 핵심 개념
 • 원하는 품목 개수 저장
 • 현재 10일 구간 개수 저장
 • 한 칸 이동할 때 빠지는 품목 제거, 새 품목 추가
 • 두 Map 비교
• 시간 복잡도:
 • 정렬 방식: O((N-9) × 10 log 10)
 • 슬라이딩 윈도우 방식: O(N) 수준
• 공간 복잡도: O(M)
*/

import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        String[] list = new String[10];
        int idx = 0;
        
        for (int i = 0; i < want.length; i++) {
            for (int j = 0; j < number[i]; j++) {
                list[idx++] = want[i];
            }
        }
        
        Arrays.sort(list);
        
        int answer = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) {
            String[] copy = Arrays.copyOfRange(discount, i, i + 10);
            Arrays.sort(copy);
            
            if (Arrays.equals(list, copy)) {
                answer++;
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
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> target = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            target.put(want[i], number[i]);
        }
        
        int answer = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> window = new HashMap<>();
            
            for (int j = i; j < i + 10; j++) {
                window.put(discount[j], window.getOrDefault(discount[j], 0) + 1);
            }
            
            if (target.equals(window)) {
                answer++;
            }
        }
        
        return answer;
    }
}

2.
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> target = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            target.put(want[i], number[i]);
        }

        Map<String, Integer> window = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            window.put(discount[i], window.getOrDefault(discount[i], 0) + 1);
        }

        int answer = 0;
        if (target.equals(window)) answer++;

        for (int i = 10; i < discount.length; i++) {
            String removeItem = discount[i - 10];
            window.put(removeItem, window.get(removeItem) - 1);
            if (window.get(removeItem) == 0) {
                window.remove(removeItem);
            }

            String addItem = discount[i];
            window.put(addItem, window.getOrDefault(addItem, 0) + 1);

            if (target.equals(window)) answer++;
        }

        return answer;
    }
}
*/
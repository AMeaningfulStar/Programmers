/*
• 알고리즘 유형: 해시셋 + 구현
• 핵심 개념
 • 중복 단어 검사 → Set
 • 끝말잇기 조건 검사
 • 사람 번호 계산: i % n + 1
 • 차례 계산: i / n + 1
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();
        used.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (used.contains(words[i]) ||
                words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                
                return new int[]{i % n + 1, i / n + 1};
            }
            
            used.add(words[i]);
        }

        return new int[]{0, 0};
    }
}
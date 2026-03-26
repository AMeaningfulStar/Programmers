/*
• 알고리즘: 정렬 기반 문자열 비교 (Sorting & Comparison)
• 핵심 개념
 • 배열 정렬 (Arrays.sort)
 • 문자열 합치기 (String.join)
 • 문자 배열 → 문자열 변환 (new String(char[]))
 • 같은 문자 구성인지 비교
• 시간 복잡도: O(D × L log L)
 • D: 사전 단어 개수
 • L: 단어 길이
• 공간 복잡도: O(L)
*/

import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String target = String.join("", spell);
        
        for (String word : dic) {
            if (word.length() == spell.length) {
                char[] arr = word.toCharArray();
                Arrays.sort(arr);
                
                if (target.equals(new String(arr))) {
                    return 1;
                }
            }
        }
        
        return 2;
    }
}

/*
다른 풀이
class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            boolean ok = true;
            
            for (String s : spell) {
                if (!word.contains(s)) {
                    ok = false;
                    break;
                }
            }
            
            if (ok) return 1;
        }
        
        return 2;
    }
}
*/
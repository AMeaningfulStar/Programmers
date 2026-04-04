/*
• 알고리즘 유형: 문자열 / 정렬 / 접두어 검사
• 핵심 개념
 • 접두어 = startsWith
 • 정렬하면 접두어 관계는 인접
 • 인접 비교로 해결 가능
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}

/*
다른 풀이
1.
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String phone : phone_book) {
            map.put(phone, 1);
        }
        
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (map.containsKey(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
*/
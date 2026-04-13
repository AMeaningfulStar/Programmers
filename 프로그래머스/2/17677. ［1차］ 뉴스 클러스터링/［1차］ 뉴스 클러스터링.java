/*
• 알고리즘 유형: 문자열 / 해시맵 / 다중집합
• 핵심 개념
 • 인접한 2글자씩 추출
 • 둘 다 알파벳일 때만 유효
 • 다중집합이므로 개수까지 관리
 • 교집합 = min, 합집합 = max
• 시간 복잡도: O(N + M)
• 공간 복잡도: O(N + M)
*/

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> map1 = makeMultiSet(str1.toLowerCase());
        Map<String, Integer> map2 = makeMultiSet(str2.toLowerCase());

        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        int intersection = 0;
        int union = 0;

        for (String key : allKeys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);

            intersection += Math.min(count1, count2);
            union += Math.max(count1, count2);
        }

        if (union == 0) return 65536;

        return (int) (((double) intersection / union) * 65536);
    }

    private Map<String, Integer> makeMultiSet(String str) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length() - 1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                String word = str.substring(i, i + 2);
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        return map;
    }
}
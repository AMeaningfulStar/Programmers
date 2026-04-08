/*
• 알고리즘 유형: 빈도수 카운팅 / 문자열
• 핵심 개념
 • 숫자별 등장 횟수 세기
 • 공통 개수 = min(countX, countY)
 • 큰 숫자부터 붙이기
• 시간 복잡도: O(|X| + |Y|)
• 공간 복잡도: O(1)
*/

/*
내 풀이
import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String str : X.split("")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        List<String> list = new ArrayList<>();
        
        for (String str : Y.split("")) {
            if (map.containsKey(str)) {
                int count = map.get(str);
                list.add(str);
                
                if (count == 1) {
                    map.remove(str);
                } else {
                    map.put(str, count - 1);
                }
            }
        }
        
        if (list.isEmpty()) return "-1";
        
        list.sort(Comparator.reverseOrder());
        
        if (list.get(0).equals("0")) return "0";
        
        StringBuilder answer = new StringBuilder();
        for (String s : list) {
            answer.append(s);
        }
        
        return answer.toString();
    }
}
*/

// 더 좋은 풀이
class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(countX[i], countY[i]);
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }
        
        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}
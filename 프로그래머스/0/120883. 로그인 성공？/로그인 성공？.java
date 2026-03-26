/*
• 알고리즘: 선형 탐색 (Linear Search)
• 핵심 개념
 • 배열 순회
 • 조건 분기 (id → pw 순서)
 • 조기 종료 (early return)
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(String[] data: db) {
            if(id_pw[0].equals(data[0])) {
                return id_pw[1].equals(data[1]) ? "login" : "wrong pw";
            }
        }
        
        return "fail";
    }
}

/*
import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> map = new HashMap<>();
        
        for (String[] data : db) {
            map.put(data[0], data[1]);
        }
        
        if (!map.containsKey(id_pw[0])) return "fail";
        
        return map.get(id_pw[0]).equals(id_pw[1]) ? "login" : "wrong pw";
    }
}
*/
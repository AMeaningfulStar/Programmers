/*
알고리즘: 빈도수 집계 + 최댓값 탐색
핵심 개념:
• Key = 문자열 길이
• Value = 해당 길이 등장 횟수
• HashMap을 이용한 빈도수 카운팅
• map.values() 순회하며 최대값 찾기
시간 복잡도: O(N)
공간 복잡도: O(K) (K = 서로 다른 길이 개수)
*/

import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (String str : strArr) {
            int len = str.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }
        
        int answer = 0;
        for (int count : map.values()) {
            answer = Math.max(answer, count);
        }
        
        return answer;
    }
}
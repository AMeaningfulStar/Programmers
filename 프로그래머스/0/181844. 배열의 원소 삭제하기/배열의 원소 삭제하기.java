/*
알고리즘: 필터링 + 해시 탐색
핵심 개념
• 삭제 목록을 HashSet으로 변환
• contains를 이용해 O(1) 탐색
• 조건 만족 시 결과 리스트에 추가
시간 복잡도: O(N + M)
공간 복잡도: O(M)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : delete_list) {
            set.add(num);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int num : arr) {
            if(!set.contains(num)) {
                list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        outer:
        for(int num : arr) {
            for(int del : delete_list) {
                if(num == del) continue outer;
            }
            list.add(num);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
*/
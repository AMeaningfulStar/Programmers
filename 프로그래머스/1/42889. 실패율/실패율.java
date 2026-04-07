/*
• 알고리즘 유형: 구현 + 정렬
• 핵심 개념
 • 스테이지별 인원 수 카운팅
 • 실패율 계산
 • 실패율 내림차순, 스테이지 번호 오름차순 정렬
• 시간 복잡도:
 • 현재 방식: O(N × M)
 • 추천 방식: O(N + M + N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] count = new int[N + 2];
        
        // 각 스테이지에 머물러 있는 사람 수
        for (int stage : stages) {
            count[stage]++;
        }
        
        int players = stages.length;
        List<Stage> list = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            double fail = 0.0;
            
            if (players > 0) {
                fail = (double) count[i] / players;
            }
            
            list.add(new Stage(i, fail));
            players -= count[i];
        }
        
        list.sort((a, b) -> {
            if (Double.compare(b.fail, a.fail) == 0) {
                return a.num - b.num;
            }
            return Double.compare(b.fail, a.fail);
        });
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).num;
        }
        
        return answer;
    }
    
    static class Stage {
        int num;
        double fail;
        
        Stage(int num, double fail) {
            this.num = num;
            this.fail = fail;
        }
    }
}

/*
나의 풀이
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
            int failed = 0;
            int tried = 0;
            
            for(int stage: stages) {
                failed += stage == i + 1 ? 1 : 0;
                tried += stage >= i + 1 ? 1 : 0;
            }
            
            map.put(i + 1, tried == 0 ? 0.0 : (double) failed / tried);
        }
        
        List<Integer> keys = new ArrayList<>(map.keySet());
        
        keys.sort((o1, o2) -> {
            int cmp = map.get(o2).compareTo(map.get(o1));
            if (cmp == 0) return o1 - o2;
            return cmp;
        });
        
        int[] answer = new int[N];
        int idx = 0;
        
        for(int key: keys) {
            answer[idx++] =key;
        }
        
        return answer;
    }
}
*/
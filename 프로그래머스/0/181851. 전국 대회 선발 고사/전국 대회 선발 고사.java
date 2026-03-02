/*
알고리즘: 필터링 + 정렬 + 상위 3개 선택
핵심 개념:
• attendance[i] == true인 원소만 추림(Filtering)
• (rank, index) 쌍을 만들어 rank 기준 오름차순 정렬
• 정렬된 결과에서 상위 3명의 index로 식 10000*a + 100*b + c 계산
자료구조:
• ArrayList<int[]> : 후보 (등수, 인덱스) 저장
• 정렬 Comparator로 rank 기준 정렬
시간 복잡도: O(N log N) (후보가 N개일 수 있어 정렬)
공간 복잡도: O(N) (후보 리스트)
*/

import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> candidates = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                candidates.add(new int[]{rank[i], i}); // [등수, 인덱스]
            }
        }
        
        candidates.sort(Comparator.comparingInt(a -> a[0])); // 등수 오름차순
        
        int a = candidates.get(0)[1];
        int b = candidates.get(1)[1];
        int c = candidates.get(2)[1];
        
        return 10000 * a + 100 * b + c;
    }
}

/*
map을 이용한 풀이
import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new HashMap<>(); // rank -> index
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }
        
        List<Integer> ranks = new ArrayList<>(map.keySet());
        Collections.sort(ranks); // rank 오름차순
        
        int a = map.get(ranks.get(0));
        int b = map.get(ranks.get(1));
        int c = map.get(ranks.get(2));
        
        return 10000 * a + 100 * b + c;
    }
}
*/
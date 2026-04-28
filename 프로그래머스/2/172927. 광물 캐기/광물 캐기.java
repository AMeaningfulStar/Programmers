/*
• 알고리즘 유형: 그리디 / 정렬 / 구현
• 핵심 개념: 5개 단위 그룹화, 난이도 정렬, 좋은 곡괭이 우선 배정
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        List<int[]> list = new ArrayList<>();
        
        int totalPicks = picks[0] + picks[1] + picks[2];
        int maxMinerals = Math.min(minerals.length, totalPicks * 5);
        
        for (int i = 0; i < maxMinerals; i += 5) {
            int end = Math.min(i + 5, maxMinerals);
            
            int diamondCount = 0;
            int ironCount = 0;
            int stoneCount = 0;
            
            for (int j = i; j < end; j++) {
                switch (minerals[j]) {
                    case "diamond":
                        diamondCount++;
                        break;
                    case "iron":
                        ironCount++;
                        break;
                    default:
                        stoneCount++;
                        break;
                }
            }
            
            list.add(new int[]{diamondCount, ironCount, stoneCount});
        }
        
        list.sort((a, b) -> {
            if(a[0] != b[0]) return b[0] - a[0];
            if(a[1] != b[1]) return b[1] - a[1];
            return b[2] - a[2];
        });
             
        int answer = 0;
        
        for (int[] group : list) {
            int diamond = group[0];
            int iron = group[1];
            int stone = group[2];
            
            if (picks[0] > 0) {
                answer += diamond + iron + stone;
                picks[0]--;
            } else if (picks[1] > 0) {
                answer += diamond * 5 + iron + stone;
                picks[1]--;
            } else {
                answer += diamond * 25 + iron * 5 + stone;
                picks[2]--;
            }
        }
        
        return answer;
    }
}
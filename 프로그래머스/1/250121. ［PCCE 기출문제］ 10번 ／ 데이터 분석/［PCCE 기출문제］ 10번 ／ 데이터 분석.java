/*
• 알고리즘 유형: 구현 / 정렬 / 필터링
• 핵심 개념
 • 문자열 조건을 컬럼 인덱스로 변환
 • 조건에 맞는 행만 추출
 • 지정된 컬럼 기준 정렬
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        
        int extIdx = getIndex(ext);
        int sortIdx = getIndex(sort_by);
        
        for (int[] d : data) {
            if (d[extIdx] < val_ext) {
                list.add(d);
            }
        }
        
        list.sort((a, b) -> Integer.compare(a[sortIdx], b[sortIdx]));
        
        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    private int getIndex(String s) {
        if (s.equals("code")) return 0;
        if (s.equals("date")) return 1;
        if (s.equals("maximum")) return 2;
        return 3;
    }
}
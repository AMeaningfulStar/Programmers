/*
• 알고리즘 유형: 조합 / 비트마스크 / Set
• 핵심 개념
 • 모든 컬럼 조합 생성
 • Set으로 유일성 검사
 • 기존 후보키 포함 여부로 최소성 검사
• 시간 복잡도: O(2^C × R × C)
• 공간 복잡도: O(R)
*/
// 비트마스크
import java.util.*;

class Solution {
    public int solution (String[][] relation) {
        int row = relation.length;
        int col = relation[0].length;
        
        List<Integer> candidateKeys = new ArrayList<>();
        
        for (int mask = 0; mask < (1 << col); mask++) {
            boolean minimal = true;
            
            for (int key : candidateKeys) {
                if ((key & mask) == key) {
                    minimal = false;
                    break;
                }
            }
            
            if (!minimal) continue;
            
            Set<String> set = new HashSet<>();
            
            for (int i = 0; i < row; i++) {
                StringBuilder sb = new StringBuilder();
                
                for (int j = 0; j < col; j++) {
                    if ((mask & (1 << j)) != 0) {
                        sb.append(relation[i][j]).append("|");
                    }
                }
                
                set.add(sb.toString());
            }
            
            if (set.size() == row) {
                candidateKeys.add(mask);
            }
        }
        
        return candidateKeys.size();
    }
}

/*
다른 풀이: DFS

import java.util.*;

class Solution {
    List<List<Integer>> candidateKeys = new ArrayList<>();
    
    public int solution(String[][] relation) {
        int col = relation[0].length;
        
        for (int size = 1; size <= col; size++) {
            dfs(0, size, new ArrayList<>(), relation);
        }
        
        return candidateKeys.size();
    }
    
    private void dfs(int start, int targetSize, List<Integer> selected, String[][] relation) {
        if (selected.size() == targetSize) {
            if (isMinimal(selected) && isUnique(selected, relation)) {
                candidateKeys.add(new ArrayList<>(selected));
            }
            return;
        }
        
        int col = relation[0].length;
        
        for (int i = start; i < col; i++) {
            selected.add(i);
            dfs(i + 1, targetSize, selected, relation);
            selected.remove(selected.size() - 1);
        }
    }
    
    private boolean isUnique(List<Integer> selected, String[][] relation) {
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < relation.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int col : selected) {
                sb.append(relation[i][col]).append("|");
            }
            
            set.add(sb.toString());
        }
        
        return set.size() == relation.length;
    }
    
    private boolean isMinimal(List<Integer> selected) {
        for (List<Integer> key : candidateKeys) {
            if (selected.containsAll(key)) {
                return false;
            }
        }
        
        return true;
    }
}
*/
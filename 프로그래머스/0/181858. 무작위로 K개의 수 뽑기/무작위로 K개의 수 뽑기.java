/*
알고리즘: 순서 유지 중복 제거 + 고정 길이 결과 구성
핵심 개념:
• 순서 유지 → List
• 중복 체크 → Set
• 최대 k개만 필요 → 조기 종료 가능
• 부족하면 -1로 채우기
시간 복잡도:
기존 코드: O(N²) (contains 때문에)
개선 코드: O(N)
공간 복잡도: O(N)
*/

// 더 나은 풀이
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                list.add(num);
            }
            if (list.size() == k) break; // k개면 종료
        }
        
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = i < list.size() ? list.get(i) : -1;
        }
        
        return answer;
    }
}

/*
나의 풀이
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int num: arr) {
            if(!list.contains(num)) {
                list.add(num);
            }
        }
        
        int[] answer = new int[k];
        
        for(int idx = 0; idx < k; idx++) {
            if(idx < list.size()) {
                answer[idx] = list.get(idx);
            } else {
                 answer[idx] = -1;
            }
        }
        
        return answer;
    }
}
*/
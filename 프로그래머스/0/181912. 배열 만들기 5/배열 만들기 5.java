/*
알고리즘: 선형 순회 + 필터링
핵심 개념:
• 문자열 구간 추출: substring(s, s + l)
• 문자열 → 정수 변환: Integer.parseInt
• 조건 필터링: num > k
• 가변 결과 수집: List<Integer> 사용 후 int[]로 변환
시간 복잡도: O(N * l) (N = intStrs.length, substring/파싱이 길이 l에 비례)
공간 복잡도: O(R) (R = 조건을 만족한 원소 개수, 결과 리스트/배열)
*/

import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(String intStr: intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s + l));
            
            if(k < num) {
                list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int idx = 0; idx < list.size(); idx++) {
            answer[idx] = list.get(idx);
        }
        
        return answer;
    }
}

/*
개선한 코드
import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>(intStrs.length);

        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k) list.add(num);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
*/

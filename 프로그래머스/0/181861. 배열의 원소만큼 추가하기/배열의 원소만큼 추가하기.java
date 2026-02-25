/*
알고리즘: 중첩 반복을 통한 원소 확장(Expansion)
핵심 개념:
• 외부 반복: 배열 순회
• 내부 반복: 현재 값 num만큼 반복 추가
• 가변 길이 결과를 위해 ArrayList 사용
• 마지막에 고정 배열로 변환
시간 복잡도: O(∑arr[i]) (출력 배열의 총 길이와 동일)
공간 복잡도: O(∑arr[i]) (결과 저장 공간)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int num: arr) {
            for(int count = 0; count < num; count++) {
                list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int idx = 0; idx < list.size(); idx++) {
            answer[idx] = list.get(idx);
        }
        
        return answer;
        
        /*
        간결한 풀이
        1. 
        return list.stream().mapToInt(i -> i).toArray();
        
        2.
        return list.toArray(new Integer[0]); // (int 배열은 stream이 필요)
        */
    }
}
/*
• 알고리즘 유형: 정렬 / 문자열 Comparator
• 핵심 개념
 • 숫자를 문자열로 변환
 • 두 문자열 a, b는 a+b 와 b+a 비교
 • 더 큰 조합이 앞에 오도록 정렬
 • 전부 0인 경우 "0" 처리
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        
        // 전부 0인 경우
        if (arr[0].equals("0")) return "0";
        
        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }
        
        return answer.toString();
    }
}
/*
• 알고리즘 유형: 구현 / 누적합
• 핵심 개념
 • 우박수열 생성
 • 사다리꼴 넓이 계산
 • 누적합으로 구간 넓이 빠르게 계산
• 시간 복잡도: O(우박수열 길이 + ranges 길이)
• 공간 복잡도: O(우박수열 길이)
*/

import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        List<Integer> values = new ArrayList<>();
        
        values.add(k);
        
        while (k > 1) {
            if (k % 2 == 0) {
                k /= 2;
            } else {
                k = k * 3 + 1;
            }
            
            values.add(k);
        }
        
        int last = values.size() - 1;
        
        double[] prefix = new double[last + 1];
        
        for (int i = 0; i < last; i++) {
            double area = (values.get(i) + values.get(i + 1)) / 2.0;
            
            prefix[i + 1] = prefix[i] + area;
        }
        
        double[] answer = new double[ranges.length];
        
        for (int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = last + ranges[i][1];
            
            if (start > end) {
                answer[i] = -1.0;
            } else {
                answer[i] = prefix[end] - prefix[start];
            }
        }
        
        return answer;
    }
}
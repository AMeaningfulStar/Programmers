/*
• 알고리즘 유형: 약수 탐색 / 수학
• 핵심 개념 목록
 • 1부터 number까지 각 숫자의 약수 개수 구하기
 • 약수는 쌍으로 존재하므로 sqrt(i)까지만 탐색
 • 제곱수는 1개만 더하기
 • limit 초과 시 power로 대체
• 시간 복잡도: O(number × √number)
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int count = 0;
            
            for (int num = 1; num * num <= i; num++) {
                if (i % num == 0) {
                    count += (num * num == i) ? 1 : 2;
                }
            }
            
            answer += (count > limit) ? power : count;
        }
        
        return answer;
    }
}
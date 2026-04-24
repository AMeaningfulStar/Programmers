/*
• 알고리즘 유형: 수학 / 순열 / 팩토리얼
• 핵심 개념
 • 순열 전체 생성 금지
 • (남은 사람 수 - 1)! 단위로 묶음 계산
 • k / blockSize로 선택할 사람 인덱스 결정
 • 선택한 사람은 리스트에서 제거
• 시간 복잡도: O(n²)
• 공간 복잡도: O(n)
*/

import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        List<Integer> people = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }
        
        long[] factorial = new long[n + 1];
        factorial[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        int[] answer = new int[n];
        k--; // 0-based로 변환
        
        for (int i = 0; i < n; i++) {
            int remain = n - 1 - i;
            long blockSize = factorial[remain];
            
            int index = (int) (k / blockSize);
            answer[i] = people.remove(index);
            
            k %= blockSize;
        }
        
        return answer;
    }
}
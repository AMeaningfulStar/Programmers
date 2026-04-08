/*
• 알고리즘 유형: 그리디 / 구현
• 핵심 개념
 • 학생별 체육복 상태 배열 관리
 • 체육복 없는 학생을 순서대로 해결
 • 왼쪽 우선, 없으면 오른쪽 확인
 • 배열 범위 체크 필수
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        int[] student = new int[n];
        Arrays.fill(student, 1);
        
        for (int l : lost) student[l - 1]--;
        for (int r : reserve) student[r - 1]++;
        
        for (int i = 0; i < n; i++) {
            if (student[i] == 0) {
                if (i > 0 && student[i - 1] == 2) {
                    student[i - 1]--;
                    student[i]++;
                } else if (i < n - 1 && student[i + 1] == 2) {
                    student[i + 1]--;
                    student[i]++;
                } else {
                    answer--;
                }
            }
        }
        
        return answer;
    }
}
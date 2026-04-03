/*
• 알고리즘: 순차 탐색 / 투 포인터
• 핵심 개념
 • 각 배열의 현재 위치만 관리
 • goal을 앞에서부터 순서대로 검사
 • 범위 체크 후 비교
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        
        for (String word : goal) {
            if (idx1 < cards1.length && cards1[idx1].equals(word)) {
                idx1++;
            } else if (idx2 < cards2.length && cards2[idx2].equals(word)) {
                idx2++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}
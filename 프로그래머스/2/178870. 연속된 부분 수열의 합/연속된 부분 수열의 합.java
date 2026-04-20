/*
• 알고리즘 유형: 투포인터 / 슬라이딩 윈도우
• 핵심 개념
 • 양수 수열이므로 구간합 조절 가능
 • sum < k면 오른쪽 확장
 • sum > k면 왼쪽 축소
 • sum == k면 후보 갱신
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int[] solution(int[] sequence, int k) {
        int start = 0;
        int end = 0;
        int sum = sequence[0];
        
        int bestStart = 0;
        int bestEnd = sequence.length - 1;
        int bestLength = Integer.MAX_VALUE;
        
        while (start < sequence.length && end < sequence.length) {
            if (sum == k) {
                int length = end - start;
                
                if (length < bestLength) {
                    bestLength = length;
                    bestStart = start;
                    bestEnd = end;
                }
                
                sum -= sequence[start];
                start++;
            } 
            else if (sum < k) {
                end++;
                if (end < sequence.length) {
                    sum += sequence[end];
                }
            } 
            else { // sum > k
                sum -= sequence[start];
                start++;
            }
        }
        
        return new int[]{bestStart, bestEnd};
    }
}
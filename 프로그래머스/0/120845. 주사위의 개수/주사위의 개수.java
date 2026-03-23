/*
• 알고리즘: 수학 계산 (Mathematical Calculation)
• 핵심 개념
 • 공간 분할
 • 각 축별 개수 계산 (size / n)
 • 곱셈으로 전체 개수 계산
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int size: box) {
            answer *= (size / n);
        }
        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
*/
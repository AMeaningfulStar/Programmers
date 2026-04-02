/*
• 알고리즘: 수학 (등차수열)
• 핵심 개념
 • 1 ~ n 합 공식
 • overflow 방지 (long)
• 시간 복잡도: O(1)
• 공간 복잡도: O(1)
*/

class Solution {
    public long solution(int price, int money, int count) {
        long total = (long) price * count * (count + 1) / 2;
        return Math.max(0, total - money);
    }
}
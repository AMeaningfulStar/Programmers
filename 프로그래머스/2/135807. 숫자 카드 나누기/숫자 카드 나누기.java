/*
• 알고리즘 유형: 최대공약수 / 수학 / 구현
• 핵심 개념
 • 배열 전체를 나누는 가장 큰 수 = 최대공약수
 • 후보는 gcdA, gcdB 두 개뿐
 • 상대 배열을 하나도 나누지 못해야 정답 후보
• 시간 복잡도: O(N log M) 정도
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        
        for(int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
        }
        
        for(int i = 1; i < arrayB.length; i++) {
            gcdB = gcd(gcdB, arrayB[i]);
        }
        
        int answerA = canDivide(gcdA, arrayB) ? gcdA : 0;
        int answerB = canDivide(gcdB, arrayA) ? gcdB : 0;
        
        return Math.max(answerA, answerB);
    }
    
    private int gcd(int a, int b) {
        if(b == 0) return a;
        
        return gcd(b, a % b);
    }
    
    private boolean canDivide(int gcdValue, int[] otherArray) {
        for(int num : otherArray) {
            if(num % gcdValue == 0) return false;
        }
        
        return true;
    }
}
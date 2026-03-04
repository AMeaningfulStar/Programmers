/*
알고리즘: 큰 정수 덧셈(Big Integer Arithmetic)
핵심 개념:
• 일반 int/long 범위를 초과하는 정수 처리
• BigInteger 내부적으로 배열 기반 큰 수 연산
• 문자열 → BigInteger → 덧셈 → 문자열 변환
시간 복잡도: O(N) (N = 숫자 자릿수)
공간 복잡도: O(N)
*/

import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);
		return bigA.add(bigB).toString();
    }
}

/*
BigInteger을 사용하지 않은 풀이

class Solution {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            
            sb.append(sum % 10);
            carry = sum / 10;
        }
        
        return sb.reverse().toString();
    }
}
*/
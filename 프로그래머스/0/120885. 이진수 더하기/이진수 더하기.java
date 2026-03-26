/*
(현재 풀이 기준)
• 알고리즘: 진법 변환 + 산술 연산
• 핵심 개념
 • 이진수 → 정수 변환 (parseInt)
 • 정수 덧셈
 • 정수 → 이진수 변환 (toBinaryString)
• 시간 복잡도: O(N)
• 공간 복잡도: O(1)

(직접 구현 기준)
• 알고리즘: 문자열 기반 덧셈 (Binary Addition)
• 핵심 개념
 • 뒤에서부터 순회
 • 자리 올림 (carry)
 • 문자 → 숫자 변환 (c - '0')
 • 결과 뒤집기 (reverse)
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        int sum = num1 + num2;
        
        answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}

/*
다른 풀이
(직접 구현)
class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            if (i >= 0) sum += bin1.charAt(i--) - '0';
            if (j >= 0) sum += bin2.charAt(j--) - '0';
            
            result.append(sum % 2);
            carry = sum / 2;
        }
        
        return result.reverse().toString();
    }
}
*/
/*
• 알고리즘 유형: 구현 / 문자열 / 소수 판별
• 핵심 개념
 • n을 k진수 문자열로 변환
 • 0을 기준으로 분리
 • 빈 문자열 제외
 • 각 조각을 10진수로 보고 소수 판별
• 시간 복잡도: 소수 판별 비용 포함
• 공간 복잡도: O(문자열 길이)
*/

class Solution {
    public int solution(int n, int k) {
        String converted = Integer.toString(n, k);
        String[] numbers = converted.split("0");
        
        int answer = 0;
        
        for (String num : numbers) {
            if (!num.isEmpty()) {
                long value = Long.parseLong(num);
                if (isPrime(value)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(long num) {
        if (num < 2) return false;
        
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}

/*
내 풀이
import java.util.*;

class Solution {
    public int solution(int n, int k) {
        Stack<Integer> stack = new Stack<>();
        
        while (n > 0) {
            stack.push(n % k);
            n /= k;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        String[] numbers = sb.toString().split("0");
        int answer = 0;
        
        for (String num : numbers) {
            if (!num.equals("")) {
                long value = Long.parseLong(num);
                if (isPrime(value)) answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(long num) {
        if (num < 2) return false;
        
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}
*/
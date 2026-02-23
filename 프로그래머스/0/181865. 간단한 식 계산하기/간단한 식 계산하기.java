/*
알고리즘: 문자열 파싱 + 조건 분기 계산
핵심 개념:
• split(" ")로 토큰화
• 문자열 → 정수 변환 (Integer.parseInt)
• 연산자에 따른 분기 처리 (switch-case)
• 간단한 계산기 구현 패턴
시간 복잡도: O(N) (split이 문자열을 한 번 순회)
공간 복잡도: O(N) (토큰 배열 생성)
*/

class Solution {
    public int solution(String binomial) {
        int a = Integer.parseInt(binomial.split(" ")[0]);
        String op = binomial.split(" ")[1];
        int b = Integer.parseInt(binomial.split(" ")[2]);
        
        int answer = 0;
        
        switch(op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            default: return 0;
        }
    }
}

/*
가독성이 좋은 코드
class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
        
        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);

        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
        }
        
        return 0;
    }
}
*/
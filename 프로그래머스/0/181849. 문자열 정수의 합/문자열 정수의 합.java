/*
알고리즘: 선형 순회 + 문자 → 숫자 변환
핵심 개념:
• 문자열 각 문자 접근 (charAt)
• 아스키 코드 기반 숫자 변환 (c - '0')
• 누적합 계산
시간 복잡도: O(N)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for(int idx = 0; idx < num_str.length(); idx++) {
            answer += Integer.parseInt(num_str.charAt(idx) + "");
        }
        
        return answer;
    }
}

/*
더 나은 풀이
class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for(int i = 0; i < num_str.length(); i++) {
            answer += num_str.charAt(i) - '0';
        }

        return answer;
    }
}
*/
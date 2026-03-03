/*
알고리즘: 문자열 → 정수 변환 (파싱)
핵심 개념:
• Integer.parseInt() 내부적으로 문자 순회
• 각 자리수에 10을 곱하며 누적 계산
• 부호 처리 가능
시간 복잡도: O(N) (문자열 길이만큼 순회)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}

/*
다른 풀이
int result = 0;
for (char c : n_str.toCharArray()) {
    result = result * 10 + (c - '0');
}
*/
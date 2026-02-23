/*
알고리즘: 문자 매핑 변환 + 부분 문자열 탐색
핵심 개념:
• 각 문자를 독립적으로 변환해야 함
• 연쇄 replace는 순서 의존적이므로 위험
• StringBuilder로 문자 단위 변환
• 변환 후 contains()로 포함 검사
시간 복잡도: O(N)
공간 복잡도: O(N)
*/

class Solution {
    public int solution(String myString, String pat) {
        return myString.replace("A", "C").replace("B", "A").replace("C", "B").contains(pat) ? 1 : 0;
    }
}

/*
더 좋은 풀이
1. 가장 안전
class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') sb.append('B');
            else if (c == 'B') sb.append('A');
            else sb.append(c);
        }

        return sb.toString().contains(pat) ? 1 : 0;
    }
}

2.
class Solution {
    public int solution(String myString, String pat) {
        String changed = myString
                .replace("A", "X")
                .replace("B", "A")
                .replace("X", "B");

        return changed.contains(pat) ? 1 : 0;
    }
}
*/

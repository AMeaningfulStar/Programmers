/*
알고리즘: 선형 순회 + 조건 문자 변환
핵심 개념:
• 각 문자 독립 처리
• 특정 문자 조건 분기
• Character.toLowerCase() 활용
• 문자열은 immutable → 새 문자열 생성
시간 복잡도: O(N)
공간 복잡도: O(N)
*/

class Solution {
    public String solution(String myString) {
        return myString
                .toLowerCase()
                .replace('a', 'A');
    }
}

/*
더 간결한 풀이
class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder(myString.length());

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);

            if (c == 'a') {
                answer.append('A');
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer.toString();
    }
}
*/
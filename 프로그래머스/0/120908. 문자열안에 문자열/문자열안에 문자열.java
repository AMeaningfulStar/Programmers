/*
• 알고리즘: 문자열 탐색 (String Matching)
• 핵심 개념
 • 부분 문자열 포함 여부 확인
 • contains() 내부적으로 탐색 수행
 • 문자열 비교
• 시간 복잡도: O(N × M) (N: str1 길이, M: str2 길이)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(String str1, String str2) {
        return str1.indexOf(str2) != -1 ? 1 : 2;
    }
}

2.
for (int i = 0; i <= str1.length() - str2.length(); i++) {
    if (str1.substring(i, i + str2.length()).equals(str2)) {
        return 1;
    }
}
return 2;
*/
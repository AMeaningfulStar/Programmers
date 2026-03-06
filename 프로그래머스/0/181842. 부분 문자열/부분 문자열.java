/*
알고리즘: 문자열 부분 탐색 (Substring Search)
핵심 개념:
• String.contains()는 내부적으로 indexOf() 사용
• 문자열을 왼쪽부터 순회하면서 패턴 매칭 수행
• 부분 문자열 존재 여부 확인
시간 복잡도: O(N × M)
• N = str2 길이
• M = str1 길이
공간 복잡도: O(1)
*/

class Solution {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
        
        /*
        다른 풀이
        1. indexOf
        return str2.indexOf(str1) >= 0 ? 1 : 0;
        
        2.
        class Solution {
            public int solution(String str1, String str2) {
                for(int i = 0; i <= str2.length() - str1.length(); i++){
                    if(str2.substring(i, i + str1.length()).equals(str1)) {
                        return 1;
                    }
                }
                return 0;
            }
        }
        */
    }
}
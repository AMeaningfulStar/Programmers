/*
알고리즘: 문자열 정규화 + 부분 문자열 탐색
핵심 개념:
• 대소문자 통일 (toLowerCase() 또는 toUpperCase())
• String.contains() 내부는 보통 O(N*M) 비교
• 문자열은 불변 객체 → 새로운 문자열 생성됨
시간 복잡도: O(N + M + N×M) (정규화 + 포함 검사)
공간 복잡도: O(N + M) (새 문자열 생성)
*/

class Solution {
    public int solution(String myString, String pat) {
        // 풀이 1
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        return myString.contains(pat) ? 1 : 0;
        
        /*
        풀이 2
        return myString.toUpperCase().contians(pat.toUpperCase()) ? 1 : 0;
        */
    }
}
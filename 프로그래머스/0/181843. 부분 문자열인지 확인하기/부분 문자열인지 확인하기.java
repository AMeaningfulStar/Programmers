/*
알고리즘: 문자열 부분 탐색 (Substring Search)
핵심 개념:
• contains() → 내부적으로 indexOf() 사용
• 문자열을 선형 순회하며 패턴 매칭
• 부분 문자열이 존재하는지 확인
시간 복잡도: O(N × M) (N = my_string 길이, M = target 길이)
공간 복잡도: O(1)
*/

class Solution {
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
        
        /*
        다른 풀이
        1. indexOf
        return my_string.indexOf(target) != -1 ? 1 : 0;
        
        2. startsWith
        for(int i = 0; i <= my_string.length() - target.length(); i++){
            if(my_string.startsWith(target, i)) return 1;
        }
        return 0;
        */
    }
}
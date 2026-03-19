/*
• 알고리즘: 배열 순회 + 변환 (Array Traversal & Transformation)
• 핵심 개념
 • 배열 인덱스 순회
 • 문자열 길이 추출 (length())
 • 결과 배열에 값 매핑
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}

/*
다른 풀이
import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist)
                     .mapToInt(String::length)
                     .toArray();
    }
}
*/
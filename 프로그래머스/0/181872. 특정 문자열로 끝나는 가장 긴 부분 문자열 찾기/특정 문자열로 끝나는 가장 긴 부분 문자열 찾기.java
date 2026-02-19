/*
알고리즘: 문자열 검색 + 부분 문자열 추출
핵심 개념:
• lastIndexOf(pat)로 pat의 마지막 시작 위치 탐색
• 마지막 pat이 끝나는 지점: last + pat.length()
• substring(0, end)로 prefix 추출 (end는 미포함이라 end 그대로 사용)
• StringBuilder의 capacity와 length는 다르다는 점(중요!)
시간 복잡도: O(N × M) ~ O(N) (구현/내부 최적화에 따라 다름) 일반적으로 lastIndexOf가 문자열을 스캔하며 비교
공간 복잡도: O(N) (반환 문자열 생성)
*/

class Solution {
    public String solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder(myString.lastIndexOf(pat) + pat.length());
        
        for(int idx = 0; idx < myString.lastIndexOf(pat) + pat.length(); idx++) {
            answer.append(myString.charAt(idx));
        }
        
        return answer.toString();
    }
}

/*
더 좋은 풀이
1.
class Solution {
    public String solution(String myString, String pat) {
        int end = myString.lastIndexOf(pat) + pat.length();
        StringBuilder sb = new StringBuilder(end);

        for (int i = 0; i < end; i++) {
            sb.append(myString.charAt(i));
        }

        return sb.toString();
    }
}

2.
class Solution {
    public String solution(String myString, String pat) {
        int last = myString.lastIndexOf(pat);
        return myString.substring(0, last + pat.length());
    }
}
*/
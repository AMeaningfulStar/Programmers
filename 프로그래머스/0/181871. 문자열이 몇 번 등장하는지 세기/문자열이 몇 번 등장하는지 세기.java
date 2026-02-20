/*
알고리즘: 슬라이딩 윈도우 기반 부분 문자열 매칭(브루트포스)
핵심 개념:
• 길이 m = pat.length()인 창(window)을 myString 위에서 한 칸씩 이동
• 각 시작 위치 i에서 myString[i .. i+m-1]가 pat인지 비교
• 겹치는 패턴도 i를 1씩 증가시키며 모두 검사하므로 자연스럽게 카운트됨
시간 복잡도: O((N − M + 1) × M) (각 위치에서 최대 M 글자 비교)
공간 복잡도: O(1) (추가 자료구조 거의 없음, startsWith 사용 시)
*/

/*
나의 풀이
개선할 점
1. 매 반복마다 substring(0, idx+1)를 생성 → O(N^2)에 가까워짐
2.	사실 pat 길이보다 짧은 prefix는 검사할 필요가 없음
3.	더 직관적인 방식은 “시작 인덱스를 옮기며 비교”입니다.

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int idx = 0; idx < myString.length(); idx++) {
            String str = myString.substring(0, idx + 1);
            
            if(str.endsWith(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}
*/

// 더 나은 풀이
// 1.
class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int n = myString.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            if (myString.substring(i, i + m).equals(pat)) {
                count++;
            }
        }
        return count;
    }
}

/*
2.
class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.startsWith(pat, i)) {
                count++;
            }
        }
        return count;
    }
}
*/
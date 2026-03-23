/*
• 알고리즘: 반복문 + 간격 이동 (Step Iteration)
• 핵심 개념
 • 인덱스 간격 이동 (i += code)
 • 시작 위치 보정 (code - 1)
 • 문자열 순회
• 시간 복잡도: O(N / code) ≈ O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        char[] c_arr = cipher.toCharArray();
        
        for(int i = code - 1; i < c_arr.length; i += code) {
            answer.append(c_arr[i]);
        }
        
        return answer.toString();
    }
}

/*
다른 풀이
class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = code - 1; i < cipher.length(); i += code) {
            sb.append(cipher.charAt(i));
        }
        
        return sb.toString();
    }
}
*/
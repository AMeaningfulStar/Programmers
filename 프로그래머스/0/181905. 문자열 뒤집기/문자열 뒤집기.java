/*
알고리즘: 문자열 구간 분할 + 부분 뒤집기
핵심 개념:
• 문자열 인덱싱과 구간 처리
• substring(start, end)의 끝 인덱스 미포함 특성
• 특정 구간만 뒤집는 로직(StringBuilder.reverse)
• prefix / reversed(mid) / suffix 결합
시간 복잡도: O(N) (N = my_string.length(), 전체 길이만큼 복사/결합)
공간 복잡도: O(N) (결과 문자열 및 중간 StringBuilder)
*/

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.length());
        
        sb.append(my_string.substring(0, s));
        
        String mid = my_string.substring(s, e + 1);
        sb.append(new StringBuilder(mid).reverse());
        
        sb.append(my_string.substring(e + 1));
        
        return sb.toString();
    }
}

/*
더 효율적인 풀이
class Solution {
    public String solution(String my_string, int s, int e) {
        char[] chars = my_string.toCharArray();

        while (s < e) {
            char tmp = chars[s];
            chars[s] = chars[e];
            chars[e] = tmp;
            s++;
            e--;
        }

        return new String(chars);
    }
}
*/
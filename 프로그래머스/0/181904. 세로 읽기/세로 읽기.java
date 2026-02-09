/*
알고리즘: 선형 순회(고정 간격 점프)
핵심 개념:
• 문자열을 길이 m 단위로 행(row)처럼 해석
• 각 행의 시작 인덱스가 line일 때, c번째 문자의 위치는 line + (c - 1)
• 결과 문자열 누적은 StringBuilder 사용
시간 복잡도: O(N / m) (행의 개수만큼 한 글자씩 뽑음)
공간 복잡도: O(N / m) (결과 문자열 크기만큼)
*/

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for(int line = 0; line < my_string.length(); line += m) {
            answer += my_string.substring(line).charAt(c - 1) + "";
        }
        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        for (int line = 0; line < my_string.length(); line += m) {
            String row = my_string.substring(line, line + m);
            sb.append(row.charAt(c - 1));
        }

        return sb.toString();
    }
}

2.
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        for (int line = 0; line < my_string.length(); line += m) {
            String row = my_string.substring(line, line + m);
            sb.append(row.charAt(c - 1));
        }

        return sb.toString();
    }
}
*/
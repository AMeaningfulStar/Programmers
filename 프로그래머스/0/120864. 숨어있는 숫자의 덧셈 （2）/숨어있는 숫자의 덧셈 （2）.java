class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "";  // 누적 숫자 문자열

        for (String str : my_string.split("")) {
            if (str.matches("[0-9]")) {  // 한 글자가 숫자인지 확인
                num += str;
            } else {
                if (!num.isEmpty()) {
                    answer += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        // 마지막에 숫자가 남아있다면 처리
        if (!num.isEmpty()) {
            answer += Integer.parseInt(num);
        }

        return answer;
    }
}
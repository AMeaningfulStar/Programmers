class Solution {
    public long solution(String numbers) {
        String answer = "";
        String num = "";
        
        for(String number:numbers.split("")) {
            num += number;
            
            if(("zero").equals(num)) {
                answer += "0";
                num = "";
            } else if (("one").equals(num)) {
                answer += "1";
                num = "";
            } else if (("two").equals(num)) {
                answer += "2";
                num = "";
            } else if (("three").equals(num)) {
                answer += "3";
                num = "";
            } else if (("four").equals(num)) {
                answer += "4";
                num = "";
            } else if (("five").equals(num)) {
                answer += "5";
                num = "";
            } else if (("six").equals(num)) {
                answer += "6";
                num = "";
            } else if (("seven").equals(num)) {
                answer += "7";
                num = "";
            } else if (("eight").equals(num)) {
                answer += "8";
                num = "";
            } else if (("nine").equals(num)) {
                answer += "9";
                num = "";
            }
        }
        
        return Long.parseLong(answer);
    }
}
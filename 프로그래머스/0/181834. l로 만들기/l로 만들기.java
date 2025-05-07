class Solution {
    public String solution(String myString) {
        String answer = "";
		
		for(char chr: myString.toCharArray()) {
			if(chr < 'l') {
				answer += Character.toString('l');
			} else {
				answer += Character.toString(chr);
			}
		}
		
		return answer;
    }
}
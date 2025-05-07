class Solution {
    public String[] solution(String[] picture, int k) {
       String[] answer = new String[picture.length * k];
		int index = 0;
		
		for(String str: picture) {
			String changeStr = "";
			
			for(int idx = 0; idx < str.length(); idx++) {
				for(int count = 0; count < k; count++) {
					changeStr += str.split("")[idx];
				}
			}
			
			for(int idx = 1; idx <= k; idx++) {
				answer[index] = changeStr;
				index++;
			}
		}
		

		return answer;
    }
}
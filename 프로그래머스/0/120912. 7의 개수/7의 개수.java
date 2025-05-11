class Solution {
    public int solution(int[] array) {
        int answer = 0;
		
		for(int idx = 0; idx < array.length; idx++) {
			String num = Integer.toString(array[idx]);
			
			if(num.contains("7")) {
				String[] arr = num.split("");
				
				for(String str: arr) {
					if(str.equals("7")) {
						answer += 1;
					}
				}
			}
		}
		
		return answer;
    }
}
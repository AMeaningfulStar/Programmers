class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean answer = true;
		
		int cards1_idx = 0;
		int cards2_idx = 0;
		
		for(String str: goal) {
			if(!answer) break;
			
			if(cards1_idx < cards1.length && cards1[cards1_idx].equals(str)) {
				cards1_idx++;
				continue;
			} else if(cards2_idx < cards2.length && cards2[cards2_idx].equals(str)) {
				cards2_idx++;
				continue;
			} else {
				answer = false;
			}
		}
		

		return answer ? "Yes" : "No";
    }
}
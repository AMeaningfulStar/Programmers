class Solution {
    public int[] solution(int[] arr, int k) {
        for(int idx = 0; idx < arr.length; idx++) {
			if(k % 2 == 0) {
				arr[idx] += k;
			} else {
				arr[idx] *= k;
			}
		}
		return arr;
    }
}
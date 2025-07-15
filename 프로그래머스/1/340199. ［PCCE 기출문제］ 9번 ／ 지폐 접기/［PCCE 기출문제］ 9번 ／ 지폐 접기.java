import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
		
		// 정렬을 통해 작은 값은 0번 인덱스, 큰 값은 1번 인덱스로 위치
		Arrays.sort(wallet);
		Arrays.sort(bill);
		
		while(wallet[0] < bill[0] || wallet[1] < bill[1]) {
			bill[1] = bill[1] / 2;
			Arrays.sort(bill);
			answer++;
		}
		
		
		return answer;
    }
}
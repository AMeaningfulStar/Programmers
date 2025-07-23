import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

		Arrays.sort(score);

		for (int idx = score.length - m; idx > -1; idx -= m) {
			answer += score[idx] * m;
		}

		return answer;
    }
}
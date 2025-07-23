class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0; // 총 덧칠 횟수
		int ok = section[0] - 1; // 현재까지 덧칠된 마지막 위치 (처음엔 section의 시작 이전)

		for (int num : section) {
			if (ok < num) { // 아직 덧칠되지 않은 구간 발견 시
				answer++; // 덧칠 횟수 증가
				ok = num + m - 1; // 현재 위치부터 m칸을 덧칠했다고 가정
			}
		}
		
		return answer;
    }
}
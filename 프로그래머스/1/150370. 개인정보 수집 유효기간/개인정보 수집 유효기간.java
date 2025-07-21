import java.util.*;

class Solution {
    public static List<Integer> solution(String today, String[] terms, String[] privacies) {
		List<Integer> answer = new ArrayList<>();

		int todayDays = toDays(today);

		Map<String, Integer> termMap = new HashMap<>();
		for (String term : terms) {
			String[] split = term.split(" ");
			termMap.put(split[0], Integer.parseInt(split[1]));
		}

		for (int i = 0; i < privacies.length; i++) {
			String[] split = privacies[i].split(" ");
			int startDays = toDays(split[0]);
			int validMonths = termMap.get(split[1]);

			int expireDays = startDays + validMonths * 28;

			if (expireDays <= todayDays) {
				answer.add(i + 1); // 인덱스는 1부터 시작
			}
		}

		return answer;
	}

	private static int toDays(String date) {
		String[] parts = date.split("\\.");
		int year = Integer.parseInt(parts[0]);
		int month = Integer.parseInt(parts[1]);
		int day = Integer.parseInt(parts[2]);

		return (year * 12 * 28) + (month * 28) + day;
	}
}
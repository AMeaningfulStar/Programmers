import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

		int friendsLength = friends.length;
		Map<String, Integer> dic = new HashMap<String, Integer>();
		int[] giftDegree = new int[friendsLength];
		int[][] giftGraph = new int[friendsLength][friendsLength];

		for (int idx = 0; idx < friendsLength; idx++) {
			dic.put(friends[idx], idx);
		}

		for (String gift : gifts) {
			String[] giftName = gift.split(" ");
			giftDegree[dic.get(giftName[0])]++;
			giftDegree[dic.get(giftName[1])]--;
			giftGraph[dic.get(giftName[0])][dic.get(giftName[1])]++;
		}

		for (int x_idx = 0; x_idx < friendsLength; x_idx++) {
			int num = 0;

			for (int y_idx = 0; y_idx < friendsLength; y_idx++) {
				if (x_idx == y_idx) {
					continue;
				}

				if (giftGraph[x_idx][y_idx] > giftGraph[y_idx][x_idx]
						|| (giftGraph[x_idx][y_idx] == giftGraph[y_idx][x_idx] && giftDegree[x_idx] > giftDegree[y_idx])) {
					num++;
				}
			}
			
			if(answer < num) {
				answer = num;
			}
		}

		return answer;
    }
}
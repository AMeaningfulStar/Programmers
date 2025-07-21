import java.util.*;

class Solution {
    public List<Integer> solution(String[] keymap, String[] targets) {
		List<Integer> answer = new ArrayList<Integer>();

		Map<String, Integer> clickCount = new HashMap<String, Integer>();

		for (int keymap_idx = 0; keymap_idx < keymap.length; keymap_idx++) {
			String[] key_arr = keymap[keymap_idx].split("");
			for (int key_idx = 0; key_idx < key_arr.length; key_idx++) {
				if (clickCount.get(key_arr[key_idx]) == null || clickCount.get(key_arr[key_idx]) > (key_idx + 1)) {
					clickCount.put(key_arr[key_idx], key_idx + 1);
				}
			}
		}

		for (String target : targets) {
			int count = 0;
			boolean isPossible = true;

			for (String str : target.split("")) {
				Integer clicks = clickCount.get(str);
				if (clicks == null) {
					isPossible = false;
					break;
				}
				count += clicks;
			}

			answer.add(isPossible ? count : -1);
		}

		return answer;
	}
}
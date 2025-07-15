class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;

		for (int mats_idx = 0; mats_idx < mats.length; mats_idx++) {
			for (int park_row = 0; park_row <= park.length - mats[mats_idx]; park_row++) {
				for (int park_col = 0; park_col <= park[0].length - mats[mats_idx]; park_col++) {
					boolean isPass = true;

					for (int row_idx = park_row; row_idx < park_row + mats[mats_idx]; row_idx++) {
						for (int col_idx = park_col; col_idx < park_col + mats[mats_idx]; col_idx++) {
							if (!park[row_idx][col_idx].equals("-1")) {
								isPass = false;
								break;
							}
						}
						if (!isPass)
							break;
					}

					if (isPass && answer < mats[mats_idx]) {
						answer = mats[mats_idx];
					}
				}
			}
		}

		return answer;
    }
}
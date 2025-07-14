class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // "prev" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동
		// "next" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 후로 이동

		String answer = "";

		// 동영상의 길이(초 단위)
		int video_sec = Integer.parseInt(video_len.split(":")[0]) * 60 + Integer.parseInt(video_len.split(":")[1]);

		// 오프닝 시작(초 단위)
		int op_start_sec = Integer.parseInt(op_start.split(":")[0]) * 60 + Integer.parseInt(op_start.split(":")[1]);

		// 오프닝 끝(초 단위)
		int op_end_sec = Integer.parseInt(op_end.split(":")[0]) * 60 + Integer.parseInt(op_end.split(":")[1]);

		// 현 위치(초 단위)
		int pos_sec = Integer.parseInt(pos.split(":")[0]) * 60 + Integer.parseInt(pos.split(":")[1]);
		
		if (op_start_sec <= pos_sec && pos_sec <= op_end_sec) {
			pos_sec = op_end_sec;
		}
		
		for (int idx = 0; idx < commands.length; idx++) {
			switch (commands[idx]) {
			case "prev": {
				if (pos_sec - 10 < 0) {
					pos_sec = 0;
				} else {
					pos_sec -= 10;
				}
				break;
			}
			case "next": {
				if (pos_sec + 10 > video_sec) {
					pos_sec = video_sec;
				} else {
					pos_sec += 10;
				}
				break;
			}
			}

			if (op_start_sec <= pos_sec && pos_sec <= op_end_sec) {
				pos_sec = op_end_sec;
			}
		}

		answer += pos_sec / 60 < 10 ? "0" + Integer.toString(pos_sec / 60) : Integer.toString(pos_sec / 60);
		answer += ":";
		answer += pos_sec % 60 < 10 ? "0" + Integer.toString(pos_sec % 60) : Integer.toString(pos_sec % 60);

		return answer;
    }
}
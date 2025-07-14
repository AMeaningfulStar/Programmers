class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
		
		for(int schedules_idx = 0; schedules_idx < schedules.length; schedules_idx++) {
			int schedules_time  = (schedules[schedules_idx] / 100) * 60 + schedules[schedules_idx] % 100 + 10;
			
			for(int timelogs_idx = 0; timelogs_idx < 7; timelogs_idx++) {
				if((timelogs_idx + startday) % 7 > 0 && (timelogs_idx + startday) % 7 < 6) {
					int timelogs_time = (timelogs[schedules_idx][timelogs_idx] / 100) * 60 + timelogs[schedules_idx][timelogs_idx] % 100;
					
					if(schedules_time < timelogs_time) {
						answer--;
						break;
					}
				}
			}
		}
		
		return answer;
    }
}
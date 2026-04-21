/*
• 알고리즘 유형: 정렬 / 우선순위 큐
• 핵심 개념
 • 예약 시작 시간 기준 정렬
 • 종료 시간 + 청소 10분 저장
 • 가장 빨리 비는 방과 비교
 • 가능하면 재사용, 아니면 새 방
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        Arrays.sort(book_time, (a, b) -> toTime(a[0]) - toTime(b[0]));
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(String[] book: book_time) {
            int start = toTime(book[0]);
            int end = toTime(book[1]) + 10;
            
            if(!pq.isEmpty() && pq.peek()<= start) {
                pq.poll();
            }
            
            pq.offer(end);
        }
        
        return pq.size();
    }
    
    private int toTime(String str) {
        String[] arr = str.split(":");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);

        return hour * 60 + minute;
    }
}
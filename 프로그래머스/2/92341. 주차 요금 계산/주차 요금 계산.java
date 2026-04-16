/*
• 알고리즘 유형: 구현 / 해시맵 / 정렬
• 핵심 개념
 • 입차 시각 저장
 • 출차 시 누적 시간 합산
 • 미출차 차량 23:59 처리
 • 차량 번호 오름차순 정렬
 • 요금 공식 적용
• 시간 복잡도: O(N log N)
 (N = 기록 수, 정렬 포함)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inMap = new HashMap<>();
        Map<String, Integer> totalMap = new HashMap<>();
        
        for (String r : records) {
            String[] parts = r.split(" ");
            String timeStr = parts[0];
            String car = parts[1];
            String type = parts[2];
            
            int time = toTime(timeStr);
            
            if (type.equals("IN")) {
                inMap.put(car, time);
            } else {
                int inTime = inMap.get(car);
                totalMap.put(car, totalMap.getOrDefault(car, 0) + (time - inTime));
                inMap.remove(car);
            }
        }
        
        // 출차 안 한 차량 23:59 처리
        int endTime = toTime("23:59");
        for (String car : inMap.keySet()) {
            int inTime = inMap.get(car);
            totalMap.put(car, totalMap.getOrDefault(car, 0) + (endTime - inTime));
        }
        
        // 차량 번호 오름차순 정렬
        List<String> cars = new ArrayList<>(totalMap.keySet());
        Collections.sort(cars);
        
        int[] answer = new int[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            int totalTime = totalMap.get(cars.get(i));
            answer[i] = calcFee(totalTime, fees);
        }
        
        return answer;
    }
    
    private int toTime(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        return hour * 60 + minute;
    }
    
    private int calcFee(int time, int[] fees) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        if (time <= baseTime) return baseFee;
        
        int extraTime = time - baseTime;
        int extraUnits = (extraTime + unitTime - 1) / unitTime; // 올림
        return baseFee + extraUnits * unitFee;
    }
}
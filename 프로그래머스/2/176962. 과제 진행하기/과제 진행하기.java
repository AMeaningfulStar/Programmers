/*
• 알고리즘 유형: 스택 / 정렬 / 시뮬레이션
• 핵심 개념: 최근에 멈춘 과제부터 재개
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        List<String[]> planList = new ArrayList<>();
        
        for (String[] plan : plans) {
            planList.add(new String[]{
                plan[0],
                String.valueOf(toTime(plan[1])),
                plan[2]
            });
        }
        
        planList.sort((a, b) -> Integer.parseInt(a[1]) - Integer.parseInt(b[1]));
        
        Stack<String[]> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < planList.size(); i++) {
            String[] current = planList.get(i);
            String name = current[0];
            int start = Integer.parseInt(current[1]);
            int playtime = Integer.parseInt(current[2]);
            
            int nextStart = i == planList.size() - 1
                    ? Integer.MAX_VALUE
                    : Integer.parseInt(planList.get(i + 1)[1]);
            
            int availableTime = nextStart - start;
            
            if (playtime <= availableTime) {
                result.add(name);
                availableTime -= playtime;
                
                while (availableTime > 0 && !stack.isEmpty()) {
                    String[] paused = stack.pop();
                    String pausedName = paused[0];
                    int remain = Integer.parseInt(paused[1]);
                    
                    if (remain <= availableTime) {
                        result.add(pausedName);
                        availableTime -= remain;
                    } else {
                        stack.push(new String[]{pausedName, String.valueOf(remain - availableTime)});
                        availableTime = 0;
                    }
                }
            } else {
                stack.push(new String[]{name, String.valueOf(playtime - availableTime)});
            }
        }
        
        while (!stack.isEmpty()) {
            result.add(stack.pop()[0]);
        }
        
        return result.toArray(new String[0]);
    }
    
    private int toTime(String strTime) {
        String[] arr = strTime.split(":");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);
        
        return hour * 60 + minute;
    }
}
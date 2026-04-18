/*
• 알고리즘 유형: 문자열 파싱 / 정렬 / Comparator
• 핵심 개념
 • 파일명을 HEAD, NUMBER, TAIL로 분리
 • HEAD는 대소문자 무시 비교
 • NUMBER는 숫자값 비교
 • 같으면 입력 순서 유지
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

import java.util.*;

class Solution {
    static class FileInfo {
        String original;
        String head;
        int number;
        int index;
        
        FileInfo(String original, String head, int number, int index) {
            this.original = original;
            this.head = head;
            this.number = number;
            this.index = index;
        }
    }
    public String[] solution(String[] files) {
        List<FileInfo> list = new ArrayList<>();
        
        for(int i = 0; i < files.length; i++) {
            String file = files[i];
            
            int idx = 0;
            
            while(idx < file.length() && !Character.isDigit(file.charAt(idx))) {
                idx++;
            }
            
            String head = file.substring(0, idx);
            
            int start = idx;
            
            while(idx < file.length() && Character.isDigit(file.charAt(idx)) && idx - start < 5) {
                idx++;
            }
            
            int number = Integer.parseInt(file.substring(start, idx));
            
            list.add(new FileInfo(file, head, number, i));
        }
        
        list.sort((a, b) -> {
            int headCompare = a.head.toLowerCase().compareTo(b.head.toLowerCase());
            
            if (headCompare != 0) return headCompare;
            
            if (a.number != b.number) return a.number - b.number;

            return a.index - b.index;
        });
            
        String[] answer = new String[files.length];

        for (int i = 0; i < list.size(); i++) {

            answer[i] = list.get(i).original;

        }
        
        return answer;
    }
}
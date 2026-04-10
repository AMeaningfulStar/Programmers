/*
• 알고리즘 유형: 구현 / 시뮬레이션
• 핵심 개념
 • 시작 위치 찾기
 • 방향 + 거리 파싱
 • 한 칸씩 이동하며 범위/장애물 검사
 • 실패 시 원위치 유지
• 시간 복잡도: O(routes 개수 × 이동 거리)
• 공간 복잡도: O(H × W)
*/

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int hLen = park.length;
        int wLen = park[0].length();
        char[][] parkMap = new char[hLen][wLen];
        
        for (int h = 0; h < hLen; h++) {
            parkMap[h] = park[h].toCharArray();
            if (park[h].contains("S")) {
                answer[0] = h;
                answer[1] = park[h].indexOf("S");
            }
        }
        
        for (String route : routes) {
            String[] r = route.split(" ");
            String dir = r[0];
            int dist = Integer.parseInt(r[1]);
            
            int nx = answer[0];
            int ny = answer[1];
            boolean canMove = true;
            
            for (int i = 0; i < dist; i++) {
                switch (dir) {
                    case "N" -> nx--;
                    case "S" -> nx++;
                    case "W" -> ny--;
                    case "E" -> ny++;
                }
                
                // 범위 체크
                if (nx < 0 || nx >= hLen || ny < 0 || ny >= wLen) {
                    canMove = false;
                    break;
                }
                
                // 장애물 체크
                if (parkMap[nx][ny] == 'X') {
                    canMove = false;
                    break;
                }
            }
            
            if (canMove) {
                answer[0] = nx;
                answer[1] = ny;
            }
        }
        
        return answer;
    }
}
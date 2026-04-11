/*
• 알고리즘 유형: 완전탐색 / 구현
• 핵심 개념
 • 큰 돗자리부터 확인
 • 가능한 시작 위치만 순회
 • mat x mat 영역 전체 검사
• 시간 복잡도:
 대략 mats 개수 × park 크기 × mat²
• 공간 복잡도: O(1)
*/

import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        
        int lenX = park.length;
        int lenY = park[0].length;
        
        for (int idx = mats.length - 1; idx >= 0; idx--) {
            int mat = mats[idx];
            
            for (int x = 0; x <= lenX - mat; x++) {
                for (int y = 0; y <= lenY - mat; y++) {
                    boolean isOk = true;
                    
                    for (int i = x; i < x + mat; i++) {
                        for (int j = y; j < y + mat; j++) {
                            if (!park[i][j].equals("-1")) {
                                isOk = false;
                                break;
                            }
                        }
                        if (!isOk) break;
                    }
                    
                    if (isOk) {
                        return mat;
                    }
                }
            }
        }
        
        return -1;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);

        int rows = park.length;
        int cols = park[0].length;

        for (int k = mats.length - 1; k >= 0; k--) {
            int size = mats[k];

            for (int r = 0; r <= rows - size; r++) {
                for (int c = 0; c <= cols - size; c++) {
                    boolean canPlace = true;

                    for (int i = r; i < r + size; i++) {
                        for (int j = c; j < c + size; j++) {
                            if (!park[i][j].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }
                        if (!canPlace) break;
                    }

                    if (canPlace) return size;
                }
            }
        }

        return -1;
    }
}
*/
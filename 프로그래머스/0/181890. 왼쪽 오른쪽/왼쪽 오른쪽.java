/*
알고리즘: 선형 탐색 + 조건 분기 + 슬라이싱
핵심 개념:
• 배열을 왼쪽부터 순회하며 첫 "l"/"r"의 위치를 찾음
• "l"이면 prefix(앞부분) 반환: copyOfRange(0, i)
• "r"이면 suffix(뒷부분) 반환: copyOfRange(i+1, length)
• copyOfRange의 end 인덱스는 미포함이라는 점 활용
시간 복잡도: O(N) (최악: 끝까지 탐색)
공간 복잡도: O(K) (반환 배열 크기 K)
*/

import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            }
            if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return new String[0];
    }
}
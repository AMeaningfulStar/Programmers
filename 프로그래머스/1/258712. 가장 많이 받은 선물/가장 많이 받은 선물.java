/*
• 알고리즘 유형: 구현 / 해시 / 2차원 배열
• 핵심 개념
 • 친구 이름 → 인덱스 변환
 • 서로 준 선물 개수 기록
 • 선물지수 계산
 • 모든 친구 쌍 비교
 • 동률일 때 선물지수 비교, 그것도 같으면 아무도 못 받음
• 시간 복잡도: O(F² + G)
 • F: 친구 수
 • G: 선물 기록 수
• 공간 복잡도: O(F²)
*/

import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> friend = new HashMap<>();
        int friendsLen = friends.length;
        
        for (int idx = 0; idx < friends.length; idx++) {
            friend.put(friends[idx], idx);
        }
        
        int[][] giftMap = new int[friendsLen][friendsLen];
        int[] score = new int[friendsLen];
        
        for (String gift : gifts) {
            String[] names = gift.split(" ");
            
            int from = friend.get(names[0]);
            int to = friend.get(names[1]);
            
            giftMap[from][to]++;
            score[from]++;
            score[to]--;
        }
        
        int[] count = new int[friendsLen];
        
        for (int i = 0; i < friendsLen - 1; i++) {
            for (int j = i + 1; j < friendsLen; j++) {
                if (giftMap[i][j] > giftMap[j][i]) {
                    count[i]++;
                } else if (giftMap[i][j] < giftMap[j][i]) {
                    count[j]++;
                } else {
                    if (score[i] > score[j]) {
                        count[i]++;
                    } else if (score[i] < score[j]) {
                        count[j]++;
                    }
                }
            }
        }
        
        return Arrays.stream(count).max().getAsInt();
    }
}
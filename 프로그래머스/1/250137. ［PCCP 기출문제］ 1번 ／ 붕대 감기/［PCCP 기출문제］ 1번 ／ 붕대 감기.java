/*
• 알고리즘 유형: 구현 / 시뮬레이션
• 핵심 개념
 • 시간을 1초씩 진행
 • 공격 시 체력 감소, 연속 성공 초기화
 • 공격이 없으면 초당 회복
 • 연속 성공 t초 시 추가 회복
 • 체력은 최대 체력을 넘지 않음
• 시간 복잡도: O(마지막 공격 시간)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int count = 0;
        int idx = 0;
        int hp = health;
        
        for (int time = 1; time <= attacks[attacks.length - 1][0]; time++) {
            if (time == attacks[idx][0]) {
                hp -= attacks[idx][1];
                if (hp <= 0) return -1;
                
                idx++;
                count = 0;
            } else {
                hp = Math.min(health, hp + bandage[1]);
                count++;
                
                if (count == bandage[0]) {
                    hp = Math.min(health, hp + bandage[2]);
                    count = 0;
                }
            }
        }
        
        return hp;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int hp = health;
        int combo = 0;
        int attackIdx = 0;
        
        for (int time = 1; time <= attacks[attacks.length - 1][0]; time++) {
            if (attackIdx < attacks.length && time == attacks[attackIdx][0]) {
                hp -= attacks[attackIdx][1];
                if (hp <= 0) return -1;
                
                combo = 0;
                attackIdx++;
            } else {
                hp = Math.min(health, hp + bandage[1]);
                combo++;
                
                if (combo == bandage[0]) {
                    hp = Math.min(health, hp + bandage[2]);
                    combo = 0;
                }
            }
        }
        
        return hp;
    }
}
*/
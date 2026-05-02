/*
• 알고리즘 유형: DFS / 완전탐색
• 핵심 개념: 할인율 조합 생성, 가입자/매출 계산
• 시간 복잡도: O(4^M × U × M)
• 공간 복잡도: O(M)
*/

class Solution {
    int[] answer = new int[]{0, 0};
    int[] discounts = {10, 20, 30, 40};
    int[] selected;
    
    public int[] solution(int[][] users, int[] emoticons) {
        selected = new int[emoticons.length];
        
        dfs(0, users, emoticons);
        
        return answer;
    }
    
    private void dfs (int idx, int[][] users, int[] emoticons) {
        if (idx == emoticons.length) {
            calculate(users, emoticons);
            return;
        }
        
        for (int discount : discounts) {
            selected[idx] = discount;
            dfs (idx + 1, users, emoticons);
        }
    }
    
    private void calculate (int[][] users, int[] emoticons) {
        int subscriber = 0;
        int sales = 0;
        
        for (int[] user : users) {
            int minDiscount = user[0];
            int limitPrice = user[1];
            int total = 0;
            
            for (int i = 0; i < emoticons.length; i++) {
                if (selected[i] >= minDiscount) {
                    total += emoticons[i] * (100 - selected[i]) / 100;
                }
            }
            
            if (total >= limitPrice) {
                subscriber++;
            } else {
                sales += total;
            }
        }
        
        if (subscriber > answer[0]) {
            answer[0] = subscriber;
            answer[1] = sales;
        } else if (subscriber == answer[0] && sales > answer[1]){
            answer[1] = sales;
        }
    }
}
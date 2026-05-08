/*
• 알고리즘 유형: 그리디 / 투포인터
• 핵심 개념: 가장 먼 미처리 집부터 처리
• 시간 복잡도: O(n)
• 공간 복잡도: O(1)
*/

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        
        int deliveryIdx = n - 1;
        int pickupIdx = n - 1;
        
        while (deliveryIdx >= 0 || pickupIdx >= 0) {
            while (deliveryIdx >= 0 && deliveries[deliveryIdx] == 0) {
                deliveryIdx--;
            }
            
            while (pickupIdx >= 0 && pickups[pickupIdx] == 0) {
                pickupIdx--;
            }
            
            if (deliveryIdx < 0 && pickupIdx < 0) break;
            
            int farthest = Math.max(deliveryIdx, pickupIdx);
            answer += (long) (farthest + 1) * 2;
            
            int deliverCap = cap;
            while (deliveryIdx >= 0 && deliverCap > 0) {
                if (deliveries[deliveryIdx] <= deliverCap) {
                    deliverCap -= deliveries[deliveryIdx];
                    deliveries[deliveryIdx] = 0;
                    deliveryIdx--;
                } else {
                    deliveries[deliveryIdx] -= deliverCap;
                    deliverCap = 0;
                }
            }
            
            int pickupCap = cap;
            while (pickupIdx >= 0 && pickupCap > 0) {
                if (pickups[pickupIdx] <= pickupCap) {
                    pickupCap -= pickups[pickupIdx];
                    pickups[pickupIdx] = 0;
                    pickupIdx--;
                } else {
                    pickups[pickupIdx] -= pickupCap;
                    pickupCap = 0;
                }
            }
        }
        
        return answer;
    }
}
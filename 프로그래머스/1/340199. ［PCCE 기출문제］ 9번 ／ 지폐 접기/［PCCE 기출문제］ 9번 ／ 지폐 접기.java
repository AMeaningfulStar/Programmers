/*
• 알고리즘 유형: 구현 / 시뮬레이션 / 그리디
• 핵심 개념
 • 짧은 변 / 긴 변 기준 정렬
 • 큰 변을 절반으로 접기
 • 지갑에 들어갈 때까지 반복
• 시간 복잡도: O(log bill) 수준
 • 접을 때마다 큰 변이 절반으로 감소
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int walletMin = Math.min(wallet[0], wallet[1]);
        int walletMax = Math.max(wallet[0], wallet[1]);
        
        int billMin = Math.min(bill[0], bill[1]);
        int billMax = Math.max(bill[0], bill[1]);
        
        int answer = 0;
        
        while (billMin > walletMin || billMax > walletMax) {
            billMax /= 2;
            answer++;
            
            int newMin = Math.min(billMin, billMax);
            int newMax = Math.max(billMin, billMax);
            billMin = newMin;
            billMax = newMax;
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        while (bill[0] > wallet[0] || bill[1] > wallet[1]) {
            bill[1] /= 2;
            Arrays.sort(bill);
            answer++;
        }
        
        return answer;
    }
}
*/
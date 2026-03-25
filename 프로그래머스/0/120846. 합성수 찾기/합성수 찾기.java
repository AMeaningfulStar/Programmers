/*
• 알고리즘: 소수 판별 / 에라토스테네스의 체
• 핵심 개념
 • 약수 개수 기반 판별
 • √n 최적화
 • 소수/합성수 구분
• 시간 복잡도:
 • 기본: O(N²)
 • 최적: O(N log log N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            int count = 0;

            for(int j = 1; j * j <= i; j++) {
                if(i % j == 0) {
                    count += (j * j == i) ? 1 : 2;
                }
                if(count > 2) break;
            }

            if(count > 2) answer++;
        }

        return answer;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];

        for(int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for(int i = 2; i * i <= n; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int answer = 0;
        for(int i = 2; i <= n; i++) {
            if(!isPrime[i]) answer++;
        }

        return answer;
    }
}
*/
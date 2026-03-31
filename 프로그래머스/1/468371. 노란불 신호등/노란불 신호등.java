/*
• 알고리즘: 시뮬레이션 (Simulation)
• 핵심 개념
 • 각 신호등의 주기 계산 (G + Y + R)
 • 시간 t에서 현재 상태를 나머지 연산으로 판별 ((t - 1) % period)
 • 노란불 구간 판정 (G <= offset < G + Y)
 • 전체 주기의 최소공배수까지만 탐색
• 시간 복잡도: O(LCM × N)
• 공간 복잡도: O(1)
*/

class Solution {
    public int solution(int[][] signals) {
        int n = signals.length;
        int lcm = 1;

        // 전체 주기의 최소공배수 계산
        for (int[] signal : signals) {
            int period = signal[0] + signal[1] + signal[2];
            lcm = lcm(lcm, period);
        }

        // 1초부터 LCM 시점까지 검사
        for (int t = 1; t <= lcm; t++) {
            boolean allYellow = true;

            for (int[] signal : signals) {
                int g = signal[0];
                int y = signal[1];
                int r = signal[2];
                int period = g + y + r;

                int offset = (t - 1) % period;

                // 노란불 구간이 아니면 실패
                if (!(g <= offset && offset < g + y)) {
                    allYellow = false;
                    break;
                }
            }

            if (allYellow) {
                return t;
            }
        }

        return -1;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
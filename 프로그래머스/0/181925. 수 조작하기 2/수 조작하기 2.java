/*
알고리즘: 선형 순회
핵심 개념: 배열 인접 원소 차이, switch-case 매핑
시간 복잡도: O(N)
공간 복잡도: O(N)
*/
class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder(numLog.length - 1);

        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];

            switch (diff) {
                case 1  -> sb.append('w');
                case -1 -> sb.append('s');
                case 10 -> sb.append('d');
                case -10-> sb.append('a');
            }
        }

        return sb.toString();
    }
}
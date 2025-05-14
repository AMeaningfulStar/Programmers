class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = Integer.toString(k);

        for (int num = i; num <= j; num++) {
            String[] digits = Integer.toString(num).split("");
            for (String digit : digits) {
                if (digit.equals(kStr)) answer++;
            }
        }

        return answer;
    }
}
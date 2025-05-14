class Solution {
    public int solution(int[] sides) {
        int max = 0, sum = 0;
        for (int num : sides) {
            sum += num;
            if (num > max) max = num;
        }
        return (sum - max) > max ? 1 : 2;
    }
}
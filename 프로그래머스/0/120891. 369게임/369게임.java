class Solution {
    public int solution(int order) {
        String[] order_str = Integer.toString(order).split("");
        int count = 0;
        for(int idx = 0; idx < order_str.length; idx++) {
            if(order_str[idx].equals("3") || order_str[idx].equals("6") || order_str[idx].equals("9")) {
                count++;
            }
        }
        
        return count;
    }
}
/*
알고리즘: 반복 (Loop)
자료구조: String, StringBuilder
시간 복잡도: O(N × k)
공간 복잡도: O(N × k)
*/
class Solution {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder(my_string.length() * k);
        
        for(int count = 0; count < k; count++){
            answer.append(my_string);
        }
        
        return answer.toString();
        
        /*
        다른 풀이
        return my_string.repeat(k);
        */
    }
}
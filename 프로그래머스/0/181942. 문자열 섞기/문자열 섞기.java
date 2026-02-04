/*
알고리즘: 단순 반복
자료구조: String, StringBuilder
시간 복잡도: O(N)
공간 복잡도: O(N)
*/
class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder(str1.length() * 2);
        
        for(int idx = 0; idx < str1.length(); idx++){
            answer.append(str1.charAt(idx)).append(str2.charAt(idx));
        }
        
        return answer.toString();
    }
}
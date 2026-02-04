/*
알고리즘: 선형 순회 (O(N))
자료구조: String[], StringBuilder
시간 복잡도: O(총 문자열 길이)
공간 복잡도: O(총 문자열 길이)
*/
class Solution {
    public String solution(String[] arr) {
        int totalLength = 0;
        
        for(String str:arr){
            totalLength += str.length();
        }
        
        StringBuilder answer = new StringBuilder(totalLength);
        
        for(String str:arr){
            answer.append(str);
        }
        
        return answer.toString();
    }
}
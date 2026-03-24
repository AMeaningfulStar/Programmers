/*
• 알고리즘: 문자열 인덱스 교환 (Index Swap)
• 핵심 개념
 • 문자 배열 변환 (toCharArray)
 • swap (임시 변수)
 • 문자열 재구성
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        
        return new String(arr);
    }
}

/*
다른 풀이
class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        
        char c1 = sb.charAt(num1);
        char c2 = sb.charAt(num2);
        
        sb.setCharAt(num1, c2);
        sb.setCharAt(num2, c1);
        
        return sb.toString();
    }
}
*/
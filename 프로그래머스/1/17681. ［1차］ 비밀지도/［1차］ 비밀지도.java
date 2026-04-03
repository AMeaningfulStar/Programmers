/*
• 알고리즘: 비트 연산 + 문자열 처리
• 핵심 개념
 • 10진수 → 2진수 변환
 • 자릿수 맞추기 (padding)
 • OR 연산 (|)
 • 비트값을 문자로 매핑
• 시간 복잡도: O(N²)
• 공간 복잡도: O(N²)
*/

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            binary = String.format("%" + n + "s", binary).replace(' ', '0');
            binary = binary.replace('1', '#').replace('0', ' ');
            answer[i] = binary;
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int num = arr1[i] | arr2[i];
            StringBuilder sb = new StringBuilder();
            
            for (int j = n - 1; j >= 0; j--) {
                if ((num & (1 << j)) != 0) sb.append('#');
                else sb.append(' ');
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}
*/
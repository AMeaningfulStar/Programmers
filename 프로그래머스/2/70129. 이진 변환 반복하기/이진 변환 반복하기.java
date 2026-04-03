/*
• 알고리즘: 문자열 처리 + 반복 시뮬레이션
• 핵심 개념
 • “0 제거” → replace
 • 길이 계산
 • 이진 변환 (toBinaryString)
 • 반복 종료 조건 ("1")
• 시간 복잡도: O(N log N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int convertCount = 0;
        
        while (!s.equals("1")) {
            int ones = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    ones++;
                } else {
                    zeroCount++;
                }
            }
            
            s = Integer.toBinaryString(ones);
            convertCount++;
        }
        
        return new int[]{convertCount, zeroCount};
    }
}

/*
다른 풀이
1.
class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int count = 0;
        
        while (!s.equals("1")) {
            int beforeLength = s.length();
            
            s = s.replace("0", "");
            
            zeroCount += beforeLength - s.length();
            
            s = Integer.toBinaryString(s.length());
            count++;
        }
        
        return new int[]{count, zeroCount};
    }
}
*/
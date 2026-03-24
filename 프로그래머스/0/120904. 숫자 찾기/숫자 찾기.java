/*
• 알고리즘: 문자열 탐색 (String Search)
• 핵심 개념
 • 문자열 변환 (String.valueOf)
 • indexOf 활용
 • char 비교 (k + '0')
• 시간 복잡도: O(N)
• 공간 복잡도: O(N)
*/

class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        int idx = str.indexOf(String.valueOf(k));
        
        return idx == -1 ? -1 : idx + 1;
    }
}

/*
다른 풀이
class Solution {
    public int solution(int num, int k) {
        char[] arr = String.valueOf(num).toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == (char)(k + '0')) {
                return i + 1;
            }
        }
        
        return -1;
    }
}
*/
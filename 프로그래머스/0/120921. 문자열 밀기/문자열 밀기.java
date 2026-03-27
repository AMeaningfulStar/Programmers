/*
• 알고리즘: 문자열 회전 시뮬레이션 (String Rotation Simulation)
• 핵심 개념
 • 문자열 비교 (equals)
 • 오른쪽 한 칸 회전
 • 반복 시뮬레이션
 • 문자열 재구성
• 시간 복잡도: O(N²)
• 공간 복잡도: O(N)
*/

class Solution {
    public int solution(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) return i;

            StringBuilder str = new StringBuilder(A.length());
            str.append(A.charAt(A.length() - 1));
            str.append(A.substring(0, A.length() - 1));

            A = str.toString();
        }

        return -1;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                return i;
            }
            
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
        }
        
        return -1;
    }
}

2.
class Solution {
    public int solution(String A, String B) {
        int idx = (A + A).indexOf(B);
        return idx == -1 ? -1 : idx;
    }
}
*/
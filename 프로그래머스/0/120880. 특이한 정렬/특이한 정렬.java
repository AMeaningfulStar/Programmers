import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] numObjects = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            numObjects[i] = numlist[i];
        }
        Arrays.sort(numObjects, (a, b) -> {
            int A = Math.abs(a - n);
            int B = Math.abs(b - n);
            if (A == B) {
                return Integer.compare(b, a);
            } else {
                return Integer.compare(A, B);
            }
        });
        int[] answer = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numObjects[i];
        }
        return answer;
    }
}
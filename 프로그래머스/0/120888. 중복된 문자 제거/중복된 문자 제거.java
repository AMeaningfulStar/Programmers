import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        my_string.chars()
            .distinct()
            .forEach(c -> sb.append((char)c));
        return sb.toString();
    }
}
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder(my_string.length());
        
        // prefix
        for (int i = 0; i < s; i++) {
            answer.append(my_string.charAt(i));
        }

        // overwrite
        answer.append(overwrite_string);

        // suffix (if 없어도 됨)
        for (int i = s + overwrite_string.length(); i < my_string.length(); i++) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
        
        /*
        다른 풀이 방법
        String prefix = my_string.substring(0, s);
        String suffix = my_string.substring(s + overwrite_string.length());
        return prefix + overwrite_string + suffix;
        */
    }
}
import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);  // 기준 스펠링 정렬

        for (String dic_str : dic) {
            if (dic_str.length() == spell.length) {
                String[] str_arr = dic_str.split("");
                Arrays.sort(str_arr);

                boolean check = true;
                for (int i = 0; i < spell.length; i++) {
                    if (!str_arr[i].equals(spell[i])) {
                        check = false;
                        break;
                    }
                }

                if (check) return 1;
            }
        }

        return 2;
    }
}

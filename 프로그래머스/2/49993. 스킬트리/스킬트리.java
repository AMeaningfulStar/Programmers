/*
• 알고리즘 유형: 문자열 / 구현
• 핵심 개념
 • 선행 스킬에 포함된 문자만 의미 있음
 • 등장 순서가 반드시 skill의 앞부분(prefix)이어야 함
• 시간 복잡도: O(스킬트리 전체 길이)
• 공간 복잡도: O(1) 또는 O(N)
*/

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skill_route = skill.toCharArray();
        
        for (String s : skill_trees) {
            boolean isGood = true;
            int idx = 0;
            
            for (char c : s.toCharArray()) {
                if (skill.contains(Character.toString(c))) {
                    if (idx >= skill_route.length || skill_route[idx] != c) {
                        isGood = false;
                        break;
                    } else {
                        idx++;
                    }
                }
            }
            
            if (isGood) answer++;
        }
        
        return answer;
    }
}

/*
다른 풀이
1.
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (String tree : skill_trees) {
            String filtered = "";
            
            for (char c : tree.toCharArray()) {
                if (skill.contains(String.valueOf(c))) {
                    filtered += c;
                }
            }
            
            if (skill.startsWith(filtered)) {
                answer++;
            }
        }
        
        return answer;
    }
}
*/
/*
• 알고리즘 유형: DFS / 백트래킹 / 순열 / 소수 판별
• 핵심 개념
 • 숫자를 이어붙여 모든 경우 생성
 • visited로 사용 여부 관리
 • Set으로 중복 제거
 • 완성된 숫자 소수 판별
• 시간 복잡도: 대략 모든 순열 개수에 비례
• 공간 복잡도: Set + visited
*/

import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        char[] arr = numbers.toCharArray();
        boolean[] visited = new boolean[arr.length];
        
        dfs("", arr, visited);
        
        int answer = 0;
        for (int num : set) {
            if (isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    private void dfs(String current, char[] numbers, boolean[] visited) {
        if (!current.equals("")) {
            set.add(Integer.parseInt(current));
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(current + numbers[i], numbers, visited);
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}

/*
나의 풀이
import java.util.*;

class Solution {

    int answer = 0;

    Set<Integer> set = new HashSet<>();

    

    public int solution(String numbers) {

        boolean[] visited = new boolean[numbers.length()];

        dfs("", numbers.toCharArray(), visited);

        

        for (int num : set) {

            if (isDecimal(num)) answer++;

        }

        

        return answer;

    }

    

    private void dfs(String num, char[] numbers, boolean[] visited) {

        if (!num.equals("")) {

            set.add(Integer.parseInt(num));

        }

        

        for (int i = 0; i < numbers.length; i++) {

            if (!visited[i]) {

                visited[i] = true;

                dfs(num + numbers[i], numbers, visited);

                visited[i] = false;

            }

        }

    }

    

    private boolean isDecimal(int number) {

        if (number < 2) return false;

        

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) return false;

        }

        

        return true;

    }

}
*/
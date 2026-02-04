class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int num = n; num > 0; num -= 2) {
            if(n % 2 != 0) {
                answer += num;
            }
            else {
                answer += (num * num);   
            }
        }
        
        return answer;
    }
}

/*
더 좋은 풀이 코드
1.
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean isOdd = (n % 2 != 0);

        for (int num = n; num > 0; num -= 2) {
            answer += isOdd ? num : num * num;
        }

        return answer;
    }
}

2.
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 != 0) { // 홀수
            for(int num = 1; num <= n; num += 2) {
                answer += num;
            }
        } else {
            for(int num = 2; num <= n; num += 2) {
                answer += num * num;
            }
        }
        
        return answer;
    }
}
*/
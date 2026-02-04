/*
알고리즘: 선형 순회
자료구조: int[], StringBuilder
시간 복잡도: O(N)
공간 복잡도: O(N) (문자열 누적)
*/
class Solution {
    public int solution(int[] num_list) {
        String even_num = "";
        String odd_num = "";
        
        for(int num: num_list) {
            if(num % 2 == 0) {
                even_num += num;
            } else {
                odd_num += num;
            }
        }
        
        
        return Integer.parseInt(even_num) + Integer.parseInt(odd_num);
    }
}

/*
1.
class Solution {
    public int solution(int[] num_list) {
        StringBuilder even_num = new StringBuilder();
        StringBuilder odd_num = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                even_num.append(num);
            } else {
                odd_num.append(num);
            }
        }

        int even = even_num.length() == 0 ? 0 : Integer.parseInt(even_num.toString());
        int odd  = odd_num.length()  == 0 ? 0 : Integer.parseInt(odd_num.toString());

        return even + odd;
    }
}

2. 안전한 코드
class Solution {
    public int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                even.append(num);
            } else {
                odd.append(num);
            }
        }

        int evenNum = even.length() == 0 ? 0 : Integer.parseInt(even.toString());
        int oddNum  = odd.length()  == 0 ? 0 : Integer.parseInt(odd.toString());

        return evenNum + oddNum;
    }
}
*/
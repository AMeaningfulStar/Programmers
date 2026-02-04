class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals("<")) {
            if(eq.equals("=")) {
                return n <= m ? 1 : 0;
            }
            
            return n < m ? 1 : 0;
        } else {
            if(eq.equals("=")) {
                return n >= m ? 1 : 0;
            }
            
            return n > m ? 1 : 0;
        }
    }
}

/*
더 좋은 풀이 코드
1. 
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String op = ineq + eq;

        return switch (op) {
            case "<=" -> (n <= m) ? 1 : 0;
            case "<!" -> (n <  m) ? 1 : 0;
            case ">=" -> (n >= m) ? 1 : 0;
            case ">!" -> (n >  m) ? 1 : 0;
            default -> 0;
        };
    }
}

2.
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean inclusive = eq.equals("=");

        if (ineq.equals("<")) {
            return (inclusive ? n <= m : n < m) ? 1 : 0;
        } else { // ">"
            return (inclusive ? n >= m : n > m) ? 1 : 0;
        }
    }
}
*/
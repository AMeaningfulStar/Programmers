/*
• 알고리즘 유형: 그래프 / 진입차수 / 진출차수
• 핵심 개념: 노드별 in/out 차수로 그래프 종류 판별
• 시간 복잡도: O(E + V)
• 공간 복잡도: O(V)
*/

class Solution {
    public int[] solution(int[][] edges) {
        int maxNode = 0;
        
        for (int[] edge : edges) {
            maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));
        }
        
        int[] in = new int[maxNode + 1];
        int[] out = new int[maxNode + 1];
        
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            
            out[from]++;
            in[to]++;
        }
        
        int created = 0;
        int stick = 0;
        int eight = 0;
        
        for (int node = 1; node <= maxNode; node++) {
            if (in[node] == 0 && out[node] >= 2) {
                created = node;
            } else if (in[node] >= 1 && out[node] == 0) {
                stick++;
            } else if (in[node] >= 2 && out[node] == 2) {
                eight++;
            }
        }
        
        int donut = out[created] - stick - eight;
        
        return new int[]{created, donut, stick, eight};
    }
}
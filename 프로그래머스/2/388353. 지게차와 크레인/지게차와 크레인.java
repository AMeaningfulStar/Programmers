/*
• 알고리즘 유형: BFS / 시뮬레이션
• 핵심 개념: 외부 빈 공간 탐색, 요청별 제거 방식 분기
• 시간 복잡도: O(requests × n × m)
• 공간 복잡도: O(n × m)
*/

import java.util.*;

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(String[] storage, String[] requests) {
        int n = storage.length;
        int m = storage[0].length();

        char[][] containers = new char[n + 2][m + 2];

        for (int i = 0; i < n + 2; i++) {
            Arrays.fill(containers[i], '0');
        }

        for (int i = 0; i < n; i++) {
            char[] s = storage[i].toCharArray();
            for (int j = 0; j < m; j++) {
                containers[i + 1][j + 1] = s[j];
            }
        }

        for (String req : requests) {
            char target = req.charAt(0);

            if (req.length() > 1) {
                // 크레인: 해당 컨테이너 전부 제거
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        if (containers[i][j] == target) {
                            containers[i][j] = '0';
                        }
                    }
                }
            } else {
                // 지게차: 외부와 닿은 target만 제거
                removeByForklift(containers, target);
            }
        }

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (containers[i][j] != '0') {
                    answer++;
                }
            }
        }

        return answer;
    }

    private void removeByForklift(char[][] containers, char target) {
        int n = containers.length;
        int m = containers[0].length;

        boolean[][] visited = new boolean[n][m];
        boolean[][] remove = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny]) continue;

                if (containers[nx][ny] == '0') {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                } else if (containers[nx][ny] == target) {
                    remove[nx][ny] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (remove[i][j]) {
                    containers[i][j] = '0';
                }
            }
        }
    }
}
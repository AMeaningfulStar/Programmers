class Solution {
    public int[] solution(String[] wallpaper) {
        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            String line = wallpaper[i];

            if (line.contains("#")) {
                int first = line.indexOf("#");
                int last = line.lastIndexOf("#");

                top = Math.min(top, i);
                bottom = Math.max(bottom, i + 1); // 마지막 행 + 1
                left = Math.min(left, first);
                right = Math.max(right, last + 1); // 마지막 열 + 1
            }
        }

        return new int[]{top, left, bottom, right};
    }
}
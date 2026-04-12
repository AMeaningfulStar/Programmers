/*
• 알고리즘 유형: 문자열 파싱 / 구현 / 시뮬레이션
• 핵심 개념
 • 메시지를 단어 단위로 분리
 • 단어와 스포일러 구간의 겹침 판정
 • 단어의 “완전 공개 시점” 계산
 • 비스포일러 등장 여부 / 이전 공개 여부 분리 관리
• 시간 복잡도: O(W × R) 정도
 • W = 단어 수, R = 스포일러 구간 수
• 공간 복잡도: O(W + R)
*/

import java.util.*;

class Solution {
    static class WordInfo {
        String word;
        int start;
        int end;
        boolean isSpoiler;
        int revealStep; // 몇 번째 클릭에서 완전히 공개되는지

        WordInfo(String word, int start, int end) {
            this.word = word;
            this.start = start;
            this.end = end;
            this.isSpoiler = false;
            this.revealStep = -1;
        }
    }

    public int solution(String message, int[][] spoiler_ranges) {
        List<WordInfo> words = parseWords(message);

        Set<String> normalWords = new HashSet<>();
        Map<Integer, List<String>> revealMap = new HashMap<>();

        // 각 단어가 스포일러 단어인지, 몇 번째 클릭에서 완전히 공개되는지 계산
        for (WordInfo info : words) {
            int maxStep = -1;

            for (int i = 0; i < spoiler_ranges.length; i++) {
                int s = spoiler_ranges[i][0];
                int e = spoiler_ranges[i][1];

                // 단어 [start, end] 와 스포일러 구간 [s, e] 가 겹치는지
                if (!(info.end < s || e < info.start)) {
                    info.isSpoiler = true;
                    maxStep = i + 1; // 클릭 순서는 1부터
                }
            }

            if (!info.isSpoiler) {
                normalWords.add(info.word);
            } else {
                info.revealStep = maxStep;
                revealMap.computeIfAbsent(maxStep, k -> new ArrayList<>()).add(info.word);
            }
        }

        int answer = 0;
        Set<String> revealedSpoilerWords = new HashSet<>();

        // 공개 순서대로 처리
        for (int step = 1; step <= spoiler_ranges.length; step++) {
            List<String> list = revealMap.getOrDefault(step, Collections.emptyList());

            for (String word : list) {
                if (normalWords.contains(word)) continue;
                if (revealedSpoilerWords.contains(word)) continue;

                answer++;
                revealedSpoilerWords.add(word);
            }
        }

        return answer;
    }

    private List<WordInfo> parseWords(String message) {
        List<WordInfo> result = new ArrayList<>();
        int n = message.length();
        int i = 0;

        while (i < n) {
            if (message.charAt(i) == ' ') {
                i++;
                continue;
            }

            int start = i;
            StringBuilder sb = new StringBuilder();

            while (i < n && message.charAt(i) != ' ') {
                sb.append(message.charAt(i));
                i++;
            }

            int end = i - 1;
            result.add(new WordInfo(sb.toString(), start, end));
        }

        return result;
    }
}
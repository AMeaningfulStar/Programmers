/*
알고리즘 / 자료구조 관점
버블 / 선택 / 삽입 정렬
• 시간 복잡도: O(N²)
• 공간 복잡도: O(1)
퀵 정렬
• 평균: O(N log N)
• 최악: O(N²)
• 공간: O(log N)
병합 정렬
• 항상 O(N log N)
• 공간: O(N)
• 안정 정렬
*/

import java.util.*;

// 버블 정렬
class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int[] copy = arr.clone();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        return Arrays.copyOf(copy, 5);
    }
}

/*
선택 정렬
class Solution {
    public int[] selectionSort(int[] arr) {
        int[] copy = arr.clone();
        int n = copy.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (copy[j] < copy[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = copy[i];
            copy[i] = copy[minIdx];
            copy[minIdx] = temp;
        }
        return copy;
    }
}

삽입 정렬
class Solution {
    public int[] insertionSort(int[] arr) {
        int[] copy = arr.clone();
        int n = copy.length;

        for (int i = 1; i < n; i++) {
            int key = copy[i];
            int j = i - 1;

            while (j >= 0 && copy[j] > key) {
                copy[j + 1] = copy[j];
                j--;
            }
            copy[j + 1] = key;
        }
        return copy;
    }
}

퀵 정렬
class Solution {

    public void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);

        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    private int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}

병합 정렬
class Solution {

    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }
}
*/
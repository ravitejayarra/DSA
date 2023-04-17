package com.Accio.sorting;
public class App {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void bubbleSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++)
            for (int j = 0; j < l - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    printArray(arr);
                }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int x = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > x)
                    arr[j + 1] = arr[j]; // shifting
                else
                    break;
            }
            arr[j + 1] = x;
            printArray(arr);
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }
            swap(arr, index, i);
            printArray(arr);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        // calculate size of arrays to allocate
        int sl = m - l + 1;
        int sr = r - m;

        int[] left = new int[sl];
        int[] right = new int[sr];

        // copy elements from original array to allocated arrays
        for (int i = 0; i < sl; i++)
            left[i] = arr[l + i];
        for (int i = 0; i < sr; i++)
            right[i] = arr[m + 1 + i];

        // compare and place elements back in sorted fashion
        int i = 0;
        int j = 0;
        int k = l;
        while (i < sl && j < sr) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        // place extra elements back if either one of the allocated array has elements
        while (i < sl) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < sr) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 4, 2, 1, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

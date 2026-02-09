package Sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {23,42,232,232,22,27,45,367,23,4,67,453,2,357,6,8,453};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int t = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = t;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

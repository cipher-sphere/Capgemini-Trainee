package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {23,42,232,232,22,27,45,367,23,4,67,453,2,357,6,8,453};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

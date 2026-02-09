public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23,42,232,232,22,27,45,367,23,4,67,453,2,357,6,8,453};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
package Activity2;

import java.util.Stack;

public class TaskD {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }

        int index = 0;
        while (!stack.isEmpty()) {
            arr[index++] = stack.pop();
        }

        System.out.println("Reversed Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

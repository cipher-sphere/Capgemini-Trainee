package Activity1;

import java.util.*;

public class TaskD {

    public static boolean isBalanced(String expression) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = sc.nextLine();

        if (isBalanced(expression)) {
            System.out.println("Balanced Expression");
        } else {
            System.out.println("Not Balanced Expression");
        }

        sc.close();
    }
}

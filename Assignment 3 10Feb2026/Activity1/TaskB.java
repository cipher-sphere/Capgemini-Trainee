import java.util.LinkedList;
import java.util.Queue;

public class TaskB {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Customer A");
        queue.add("Customer B");
        queue.add("Customer C");
        queue.add("Customer D");
        queue.add("Customer E");

        queue.poll();
        queue.poll();

        System.out.println("Remaining Queue: " + queue);
    }
}
